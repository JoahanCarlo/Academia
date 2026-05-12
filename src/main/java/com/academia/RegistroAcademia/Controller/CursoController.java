package com.academia.RegistroAcademia.Controller;

import com.academia.RegistroAcademia.DTO.Entrada.CursoRequest;
import com.academia.RegistroAcademia.DTO.Salida.CursoResponse;
import com.academia.RegistroAcademia.Service.CursoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    @Operation(description = "Registrar los cursos correspondiente")
    @ApiResponses({@ApiResponse(responseCode = "200",description = "Curso registrado satisfactoriamente"),
            @ApiResponse(responseCode = "400",description = "Datos erroneos")})
    private ResponseEntity<CursoResponse> registrarCurso(@RequestBody CursoRequest cursoRequest){
        CursoResponse cursoResponse = cursoService.registrarCurso(cursoRequest);
        return ResponseEntity.ok(cursoResponse);
    }

    @GetMapping
    @Operation(description = "Listar cursos")
    private ResponseEntity<List<CursoResponse>> listarCursos(){
        return ResponseEntity.ok(cursoService.listarCursos());
    }
}
