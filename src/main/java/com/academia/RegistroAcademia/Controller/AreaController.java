package com.academia.RegistroAcademia.Controller;

import com.academia.RegistroAcademia.DTO.Entrada.AreaRequest;
import com.academia.RegistroAcademia.DTO.Salida.AreaResponse;
import com.academia.RegistroAcademia.DTO.Salida.AulaResponse;
import com.academia.RegistroAcademia.Service.AreaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/area")
public class AreaController {
    private final AreaService areaService;

    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @PostMapping
    @Operation(summary = "Registrar area")
    @ApiResponses({@ApiResponse(responseCode = "200",description = "Area registrado satisfactoriamente"),
                 @ApiResponse(responseCode = "400",description = "Datos erroneos")})
    public ResponseEntity<AreaResponse> registrarArea(@RequestBody AreaRequest areaRequest){
        AreaResponse areaResponse = areaService.registrarArea(areaRequest);
        return ResponseEntity.ok(areaResponse);
    }

    @GetMapping
    @Operation(description = "Lista de Area")
    private ResponseEntity<List<AreaResponse>> listarArea(){
        return ResponseEntity.ok(areaService.listarArea());
    }
}
