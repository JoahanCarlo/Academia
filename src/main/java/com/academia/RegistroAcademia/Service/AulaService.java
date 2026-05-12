package com.academia.RegistroAcademia.Service;

import com.academia.RegistroAcademia.DTO.Entrada.AulaRequest;
import com.academia.RegistroAcademia.DTO.Salida.AulaResponse;
import com.academia.RegistroAcademia.Mapper.AulaMapper;
import com.academia.RegistroAcademia.Model.Aula;
import com.academia.RegistroAcademia.Repository.AulaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaService {
    private final AulaRepository aulaRepository;
    private final AulaMapper aulaMapper;

    public AulaService(AulaRepository aulaRepository, AulaMapper aulaMapper) {
        this.aulaRepository = aulaRepository;
        this.aulaMapper = aulaMapper;
    }

    public AulaResponse registrarAula(AulaRequest aulaRequest){
        Aula aula = aulaMapper.toEntity(aulaRequest);
        Aula aulaGuardada = aulaRepository.save(aula);
        return aulaMapper.toResponse(aulaGuardada);
    }

    public List<AulaResponse> listarAula(){
        return aulaRepository.findAll()
                .stream()
                .map(aulaMapper::toResponse)
                .toList();
    }

}
