package com.academia.RegistroAcademia.Controller;

import com.academia.RegistroAcademia.DTO.Entrada.MatriculaRequest;
import com.academia.RegistroAcademia.DTO.Salida.MatriculaResponse;
import com.academia.RegistroAcademia.Service.MatriculaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
    private final MatriculaService matriculaService;

    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    @PostMapping
    @Operation
    @ApiResponses({@ApiResponse(responseCode = "200",description = "Matricula registrado satisfactoriamente"),
            @ApiResponse(responseCode = "400",description = "Datos erroneos")})
    public ResponseEntity<MatriculaResponse> registrarMatricula(@RequestBody MatriculaRequest matriculaRequest){
        return ResponseEntity.ok(matriculaService.registrarMatricula(matriculaRequest));
    }

    @GetMapping
    @Operation(description = "Lista de matriculados")
    private ResponseEntity<List<MatriculaResponse>> listarMatricula(){
        return ResponseEntity.ok(matriculaService.listarMatriculados());
    }


}
