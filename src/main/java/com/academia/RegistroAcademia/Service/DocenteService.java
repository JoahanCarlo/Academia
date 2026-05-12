package com.academia.RegistroAcademia.Service;

import com.academia.RegistroAcademia.DTO.Entrada.DocenteRequest;
import com.academia.RegistroAcademia.DTO.Salida.DocenteResponse;
import com.academia.RegistroAcademia.Mapper.DocenteMapper;
import com.academia.RegistroAcademia.Model.Docente;
import com.academia.RegistroAcademia.Repository.DocenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {
    private final DocenteRepository docenteRepository;
    private final DocenteMapper docenteMapper;

    public DocenteService(DocenteRepository docenteRepository, DocenteMapper docenteMapper) {
        this.docenteRepository = docenteRepository;
        this.docenteMapper = docenteMapper;
    }

    public DocenteResponse registrarDocente(DocenteRequest docenteRequest){
        Docente docente = docenteMapper.toEntity(docenteRequest);
        Docente docenteGuardado = docenteRepository.save(docente);
        return docenteMapper.toResponse(docenteGuardado);
    }

    public List<DocenteResponse> listarDocente(){
        return docenteRepository.findAll()
                .stream()
                .map(docenteMapper::toResponse)
                .toList();
    }
}
