package com.academia.RegistroAcademia.Service;

import com.academia.RegistroAcademia.DTO.Entrada.CicloRequest;
import com.academia.RegistroAcademia.DTO.Salida.CicloResponse;
import com.academia.RegistroAcademia.Mapper.CicloMapper;
import com.academia.RegistroAcademia.Model.Ciclo;
import com.academia.RegistroAcademia.Repository.CicloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicloService {
    private final CicloRepository cicloRepository;
    private final CicloMapper cicloMapper;

    public CicloService(CicloRepository cicloRepository, CicloMapper cicloMapper) {
        this.cicloRepository = cicloRepository;
        this.cicloMapper = cicloMapper;
    }

    public CicloResponse registrarCiclo(CicloRequest cicloRequest){
        Ciclo ciclo = cicloMapper.toEntity(cicloRequest);
        Ciclo cicloGuardado = cicloRepository.save(ciclo);
        return cicloMapper.toResponse(cicloGuardado);
    }

    public List<CicloResponse> listarCiclo(){
        return cicloRepository.findAll()
                .stream()
                .map(cicloMapper::toResponse)
                .toList();
    }
}
