package com.academia.RegistroAcademia.Service;

import com.academia.RegistroAcademia.DTO.Entrada.GrupoRequest;
import com.academia.RegistroAcademia.DTO.Salida.GrupoResponse;
import com.academia.RegistroAcademia.Mapper.GrupoMapper;
import com.academia.RegistroAcademia.Model.*;
import com.academia.RegistroAcademia.Repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {
   private final GrupoMapper grupoMapper;
   private final GrupoRepository grupoRepository;
   private final CursoRepository cursoRepository;
   private final DocenteRepository docenteRepository;
   private final CicloRepository cicloRepository;
   private final AulaRepository aulaRepository;

    public GrupoService(GrupoMapper grupoMapper, GrupoRepository grupoRepository, CursoRepository cursoRepository, DocenteRepository docenteRepository, CicloRepository cicloRepository, AulaRepository aulaRepository) {
        this.grupoMapper = grupoMapper;
        this.grupoRepository = grupoRepository;
        this.cursoRepository = cursoRepository;
        this.docenteRepository = docenteRepository;
        this.cicloRepository = cicloRepository;
        this.aulaRepository = aulaRepository;
    }

    public GrupoResponse registrarGrupo(GrupoRequest grupoRequest){
        Curso curso = cursoRepository.findById(grupoRequest.getCursoId())
                .orElseThrow(()->new RuntimeException("El curso no existe"));
        Docente docente = docenteRepository.findById(grupoRequest.getDocenteId())
                .orElseThrow(()->new RuntimeException("Docente no existe"));
        Ciclo ciclo = cicloRepository.findById(grupoRequest.getCicloId())
                .orElseThrow(()->new RuntimeException("El ciclo no existe"));
        Aula aula = aulaRepository.findById(grupoRequest.getAulaId())
                .orElseThrow(()->new RuntimeException("El aula no existe"));
        Grupo grupo = new Grupo();
        grupo.setCurso(curso);
        grupo.setDocente(docente);
        grupo.setCiclo(ciclo);
        grupo.setAula(aula);
        grupoRepository.save(grupo);
        return grupoMapper.toResponse(grupo);
    }

    public List<GrupoResponse> listarGrupo(){
        return grupoRepository.findAll()
                .stream().map(grupoMapper::toResponse)
                .toList();
    }


}
