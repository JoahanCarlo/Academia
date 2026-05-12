package com.academia.RegistroAcademia.DTO.Entrada;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CicloRequest {
    private String nombreCiclo;
    private Date fechaInicio;
    private Date fechaFinal;
}
