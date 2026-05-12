package com.academia.RegistroAcademia.Mapper;

import com.academia.RegistroAcademia.DTO.Entrada.AreaRequest;
import com.academia.RegistroAcademia.DTO.Salida.AreaResponse;
import com.academia.RegistroAcademia.Model.Area;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AreaMapper {
    Area toEntity(AreaRequest areaRequest);
    @Mapping(source = "area.nombreArea", target = "nombreArea")
    AreaResponse toResponse(Area area);
}
