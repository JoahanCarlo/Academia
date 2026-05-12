package com.academia.RegistroAcademia.Controller;

import com.academia.RegistroAcademia.DTO.Entrada.AulaRequest;
import com.academia.RegistroAcademia.DTO.Salida.AulaResponse;
import com.academia.RegistroAcademia.Service.AulaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aula")
public class AulaController {
    private final AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

    @PostMapping
    @Operation(description = "Registrar el aula correspondiente")
    @ApiResponses({@ApiResponse(responseCode = "200",description = "Aula registrado satisfactoriamente"),
            @ApiResponse(responseCode = "400",description = "Datos erroneos")})
    public ResponseEntity<AulaResponse> registrarAula(@RequestBody AulaRequest aulaRequest){
        AulaResponse aulaResponse = aulaService.registrarAula(aulaRequest);
        return ResponseEntity.ok(aulaResponse);
    }

    @GetMapping
    @Operation(description = "Listar Aula")
    public ResponseEntity<List<AulaResponse>> listarAula(){
        return ResponseEntity.ok(aulaService.listarAula());
    }
}
