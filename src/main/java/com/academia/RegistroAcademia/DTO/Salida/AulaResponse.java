package com.academia.RegistroAcademia.DTO.Salida;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description="Respuesta a la información del aula")
public class AulaResponse {
    private Long id;
    private String nombreAula;
}
