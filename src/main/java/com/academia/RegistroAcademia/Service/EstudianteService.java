package com.academia.RegistroAcademia.Service;

import com.academia.RegistroAcademia.DTO.Entrada.EstudianteRequest;
import com.academia.RegistroAcademia.DTO.Salida.EstudianteResponse;
import com.academia.RegistroAcademia.Mapper.EstudianteMapper;
import com.academia.RegistroAcademia.Model.Estudiante;
import com.academia.RegistroAcademia.Repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    private final EstudianteRepository estudianteRepository;
    private final EstudianteMapper estudianteMapper;

    public EstudianteService(EstudianteRepository estudianteRepository, EstudianteMapper estudianteMapper) {
        this.estudianteRepository = estudianteRepository;
        this.estudianteMapper = estudianteMapper;
    }

    public EstudianteResponse registrarEstudiante(EstudianteRequest estudianteRequest){
        Estudiante estudiante = estudianteMapper.toEntity(estudianteRequest);
        Estudiante estudianteGuardado = estudianteRepository.save(estudiante);
        return estudianteMapper.toResponse(estudianteGuardado);
    }

    public List<EstudianteResponse> listarEstudiante(){
        return estudianteRepository.findAll()
                .stream().map(estudianteMapper::toResponse)
                .toList();
    }
}
