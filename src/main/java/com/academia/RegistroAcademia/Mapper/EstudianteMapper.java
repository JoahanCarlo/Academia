package com.academia.RegistroAcademia.Mapper;

import com.academia.RegistroAcademia.DTO.Entrada.EstudianteRequest;
import com.academia.RegistroAcademia.DTO.Salida.EstudianteResponse;
import com.academia.RegistroAcademia.Model.Estudiante;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstudianteMapper {
    Estudiante toEntity(EstudianteRequest estudianteRequest);
    EstudianteResponse toResponse(Estudiante estudiante);
}
