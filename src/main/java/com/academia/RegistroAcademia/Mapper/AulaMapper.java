package com.academia.RegistroAcademia.Mapper;

import com.academia.RegistroAcademia.DTO.Entrada.AulaRequest;
import com.academia.RegistroAcademia.DTO.Salida.AulaResponse;
import com.academia.RegistroAcademia.Model.Aula;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AulaMapper {
    Aula toEntity(AulaRequest aulaRequest);
    AulaResponse toResponse(Aula aula);
}
