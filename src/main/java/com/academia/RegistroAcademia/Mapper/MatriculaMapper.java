package com.academia.RegistroAcademia.Mapper;

import com.academia.RegistroAcademia.DTO.Entrada.MatriculaRequest;
import com.academia.RegistroAcademia.DTO.Salida.MatriculaResponse;
import com.academia.RegistroAcademia.Model.Matricula;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MatriculaMapper {
    Matricula toEntity(MatriculaRequest matriculaRequest);
    @Mapping(source = "estudiante.nombreEstudiante", target = "nombreEstudiante")
    @Mapping(source = "area.nombreArea", target = "nombreArea")
    @Mapping(source = "curso.nombreCurso", target = "nombreCurso")
    @Mapping(source = "ciclo.nombreCiclo", target = "nombreCiclo")
    @Mapping(source = "aula.nombreAula", target = "nombreAula")
    MatriculaResponse toResponse(Matricula matricula);
}
