package com.academia.RegistroAcademia.Controller;

import com.academia.RegistroAcademia.DTO.Entrada.EstudianteRequest;
import com.academia.RegistroAcademia.DTO.Salida.EstudianteResponse;
import com.academia.RegistroAcademia.Service.EstudianteService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @PostMapping
    @Operation(description = "Registrar estudiante")
    private ResponseEntity<EstudianteResponse> registrarEstudiante(@RequestBody EstudianteRequest
                                                                    estudianteRequest){
        EstudianteResponse estudianteResponse = estudianteService.registrarEstudiante(estudianteRequest);
        return ResponseEntity.ok(estudianteResponse);
    }

    @GetMapping
    @Operation(description = "Listar estudiante")
    private ResponseEntity<List<EstudianteResponse>> listarEstudiante(){
        return ResponseEntity.ok(estudianteService.listarEstudiante());
    }
}
