package com.academia.RegistroAcademia.DTO.Salida;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Respuesta a la información del Area")
public class AreaResponse {
    private Long id;
    private String codigoArea;
    private String nombreArea;
    private String descripcionArea;
}
