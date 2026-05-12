package com.academia.RegistroAcademia.Mapper;

import com.academia.RegistroAcademia.DTO.Entrada.CicloRequest;
import com.academia.RegistroAcademia.DTO.Salida.CicloResponse;
import com.academia.RegistroAcademia.Model.Ciclo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CicloMapper {
    Ciclo toEntity(CicloRequest cicloRequest);
    @Mapping(source = "ciclo.nombreCiclo", target = "nombreCiclo")
    CicloResponse toResponse(Ciclo ciclo);
}
