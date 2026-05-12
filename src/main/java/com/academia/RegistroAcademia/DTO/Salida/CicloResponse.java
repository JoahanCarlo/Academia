package com.academia.RegistroAcademia.DTO.Salida;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Respuesta a la información del Ciclo")
public class CicloResponse {
    private Long id;
    private String nombreCiclo;
    private Date fechaInicio;
    private Date fechaFinal;
}
