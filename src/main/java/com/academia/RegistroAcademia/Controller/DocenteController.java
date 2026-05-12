package com.academia.RegistroAcademia.Controller;

import com.academia.RegistroAcademia.DTO.Entrada.DocenteRequest;
import com.academia.RegistroAcademia.DTO.Salida.DocenteResponse;
import com.academia.RegistroAcademia.Service.DocenteService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docente")
public class DocenteController {
    private final DocenteService docenteService;

    public DocenteController(DocenteService docenteService) {
        this.docenteService = docenteService;
    }

    @PostMapping
    @Operation(description = "Registrar docente")
    public ResponseEntity<DocenteResponse> registrar(@RequestBody DocenteRequest docenteRequest){
        DocenteResponse docenteResponse = docenteService.registrarDocente(docenteRequest);
        return ResponseEntity.ok(docenteResponse);
    }

    @GetMapping
    @Operation(description = "Listar docente")
    private ResponseEntity<List<DocenteResponse>> listarDocente(){
        return ResponseEntity.ok(docenteService.listarDocente());
    }
}
