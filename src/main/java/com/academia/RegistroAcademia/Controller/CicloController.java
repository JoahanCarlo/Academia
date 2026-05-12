package com.academia.RegistroAcademia.Controller;

import com.academia.RegistroAcademia.DTO.Entrada.CicloRequest;
import com.academia.RegistroAcademia.DTO.Salida.CicloResponse;
import com.academia.RegistroAcademia.Service.CicloService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciclo")
public class CicloController {
    private final CicloService cicloService;

    public CicloController(CicloService cicloService) {
        this.cicloService = cicloService;
    }

    @PostMapping
    @Operation(summary = "Registrar el ciclo")
    @ApiResponses({@ApiResponse(responseCode = "200",description = "Ciclo registrado satisfactoriamente"),
            @ApiResponse(responseCode = "400",description = "Datos erroneos")})
    public ResponseEntity<CicloResponse> registrarCiclo(@RequestBody CicloRequest cicloRequest){
        CicloResponse cicloResponse = cicloService.registrarCiclo(cicloRequest);
        return ResponseEntity.ok(cicloResponse);
    }

    @GetMapping
    @Operation(description = "Lista de ciclos")
    public ResponseEntity<List<CicloResponse>> listarCiclo(){
        return ResponseEntity.ok(cicloService.listarCiclo());
    }
}
