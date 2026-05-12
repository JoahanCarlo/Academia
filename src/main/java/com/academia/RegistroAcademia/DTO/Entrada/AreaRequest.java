package com.academia.RegistroAcademia.DTO.Entrada;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AreaRequest {
    private String codigoArea;
    private String nombreArea;
    private String descripcionArea;
}
