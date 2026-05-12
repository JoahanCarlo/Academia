package com.academia.RegistroAcademia.Controller;

import com.academia.RegistroAcademia.DTO.Entrada.GrupoRequest;
import com.academia.RegistroAcademia.DTO.Salida.GrupoResponse;
import com.academia.RegistroAcademia.Service.GrupoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {
    private final GrupoService grupoService;

    public GrupoController(GrupoService grupoService) {
        this.grupoService = grupoService;
    }

    @PostMapping
    @Operation(description = "Registrar grupo")
    private ResponseEntity<GrupoResponse> registrarGrupo(@RequestBody GrupoRequest grupoRequest){
        GrupoResponse grupoResponse = grupoService.registrarGrupo(grupoRequest);
        return ResponseEntity.ok(grupoResponse);
    }

    @GetMapping
    @Operation(description = "Listar grupo")
    private ResponseEntity<List<GrupoResponse>> listarGrupo(){
        return ResponseEntity.ok(grupoService.listarGrupo());
    }
}
