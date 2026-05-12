package com.academia.RegistroAcademia.Service;

import com.academia.RegistroAcademia.DTO.Entrada.CursoRequest;
import com.academia.RegistroAcademia.DTO.Salida.CursoResponse;
import com.academia.RegistroAcademia.Mapper.CursoMapper;
import com.academia.RegistroAcademia.Model.Area;
import com.academia.RegistroAcademia.Model.Curso;
import com.academia.RegistroAcademia.Repository.AreaRepository;
import com.academia.RegistroAcademia.Repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    private final CursoMapper cursoMapper;
    private final CursoRepository cursoRepository;
    private final AreaRepository areaRepository;

    public CursoService(CursoMapper cursoMapper, CursoRepository cursoRepository, AreaRepository areaRepository) {
        this.cursoMapper = cursoMapper;
        this.cursoRepository = cursoRepository;
        this.areaRepository = areaRepository;
    }

    public CursoResponse registrarCurso(CursoRequest cursoRequest){
        Area area = areaRepository.findById(cursoRequest.getAreaId())
                .orElseThrow(()->new RuntimeException("El Área no esta encontrada"));
        Curso curso = new Curso();
        curso.setNombreCurso(cursoRequest.getNombreCurso());
        curso.setDescripcionCurso(cursoRequest.getDescripcionCurso());
        curso.setArea(area);
        cursoRepository.save(curso);
        return cursoMapper.toResponse(curso);
    }

    public List<CursoResponse> listarCursos(){
        return cursoRepository.findAll()
                .stream()
                .map(cursoMapper::toResponse)
                .toList();
    }

}
