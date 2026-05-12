package com.academia.RegistroAcademia.Mapper;

import com.academia.RegistroAcademia.DTO.Entrada.CursoRequest;
import com.academia.RegistroAcademia.DTO.Salida.CursoResponse;
import com.academia.RegistroAcademia.Model.Curso;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CursoMapper {
    Curso toEntity(CursoRequest cursoRequest);
    @Mapping(source = "curso.nombreCurso", target = "nombreCurso")
    CursoResponse toResponse(Curso curso);
}
