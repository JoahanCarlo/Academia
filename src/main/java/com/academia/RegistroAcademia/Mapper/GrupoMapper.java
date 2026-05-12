package com.academia.RegistroAcademia.Mapper;

import com.academia.RegistroAcademia.DTO.Entrada.GrupoRequest;
import com.academia.RegistroAcademia.DTO.Salida.GrupoResponse;
import com.academia.RegistroAcademia.Model.Grupo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GrupoMapper {
    Grupo toEntity(GrupoRequest grupoRequest);
    @Mapping(source = "curso.nombreCurso",target = "nombreCurso")
    @Mapping(source = "docente.nombreDocente",target = "nombreDocente")
    @Mapping(source = "ciclo.nombreCiclo",target = "nombreCiclo")
    @Mapping(source = "aula.nombreAula",target = "nombreAula")
    GrupoResponse toResponse(Grupo grupo);
}
