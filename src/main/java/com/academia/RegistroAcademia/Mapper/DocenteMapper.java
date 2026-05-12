package com.academia.RegistroAcademia.Mapper;

import com.academia.RegistroAcademia.DTO.Entrada.DocenteRequest;
import com.academia.RegistroAcademia.DTO.Salida.DocenteResponse;
import com.academia.RegistroAcademia.Model.Docente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocenteMapper {
    Docente toEntity(DocenteRequest docenteRequest);
    DocenteResponse toResponse(Docente docente);
}
