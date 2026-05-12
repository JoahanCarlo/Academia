package com.academia.RegistroAcademia.Service;

import com.academia.RegistroAcademia.DTO.Entrada.MatriculaRequest;
import com.academia.RegistroAcademia.DTO.Salida.MatriculaResponse;
import com.academia.RegistroAcademia.Mapper.MatriculaMapper;
import com.academia.RegistroAcademia.Model.Area;
import com.academia.RegistroAcademia.Model.Estudiante;
import com.academia.RegistroAcademia.Model.Grupo;
import com.academia.RegistroAcademia.Model.Matricula;
import com.academia.RegistroAcademia.Repository.AreaRepository;
import com.academia.RegistroAcademia.Repository.EstudianteRepository;
import com.academia.RegistroAcademia.Repository.GrupoRepository;
import com.academia.RegistroAcademia.Repository.MatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {
    private final MatriculaMapper matriculaMapper;
    private final MatriculaRepository matriculaRepository;
    private final EstudianteRepository estudianteRepository;
    private final AreaRepository areaRepository;
    private final GrupoRepository grupoRepository;

    public MatriculaService(MatriculaMapper matriculaMapper, MatriculaRepository matriculaRepository, EstudianteRepository estudianteRepository, AreaRepository areaRepository, GrupoRepository grupoRepository) {
        this.matriculaMapper = matriculaMapper;
        this.matriculaRepository = matriculaRepository;
        this.estudianteRepository = estudianteRepository;
        this.areaRepository = areaRepository;
        this.grupoRepository = grupoRepository;
    }

    public MatriculaResponse registrarMatricula(MatriculaRequest matriculaRequest){
        Estudiante estudiante = estudianteRepository.findById(matriculaRequest.getEstudianteId())
                .orElseThrow(()->new RuntimeException("No existe el estudiante"));
        Area area = areaRepository.findById(matriculaRequest.getAreaId())
                .orElseThrow(()->new RuntimeException(("no existe el área")));
        Grupo grupo = grupoRepository.findById(matriculaRequest.getGrupoId())
                .orElseThrow(()->new RuntimeException(("El grupo no existe")));
        Matricula matricula = new Matricula();
        matricula.setEstudiante(estudiante);
        matricula.setArea(area);
        matricula.setGrupo(grupo);
        matricula.setFechaMatricula(matriculaRequest.getFechaMatricula());
        matricula.setEstado(true);
        matriculaRepository.save(matricula);
        return matriculaMapper.toResponse(matricula);
    }

    public List<MatriculaResponse> listarMatriculados(){
        return matriculaRepository.findByEstadoTrue()
                .stream().map(matriculaMapper::toResponse)
                .toList();
    }
}
