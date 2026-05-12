package com.academia.RegistroAcademia.Service;

import com.academia.RegistroAcademia.DTO.Entrada.AreaRequest;

import com.academia.RegistroAcademia.DTO.Salida.AreaResponse;
import com.academia.RegistroAcademia.Mapper.AreaMapper;
import com.academia.RegistroAcademia.Model.Area;
import com.academia.RegistroAcademia.Repository.AreaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {
    private final AreaRepository areaRepository;
    private final AreaMapper areaMapper;

    public AreaService(AreaRepository areaRepository, AreaMapper areaMapper) {
        this.areaRepository = areaRepository;
        this.areaMapper = areaMapper;
    }

    public AreaResponse registrarArea(AreaRequest areaRequest){
        Area area = areaMapper.toEntity(areaRequest);
        Area areaGuardada = areaRepository.save(area);
        return areaMapper.toResponse(areaGuardada);
    }

    public List<AreaResponse> listarArea(){
        return areaRepository.findAll()
                .stream()
                .map(areaMapper::toResponse)
                .toList();
    }
}
