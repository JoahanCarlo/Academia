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
public class DocenteRequest {
    private String dniDocente;
    private String nombreDocente;
    private String apellidoDocente;
    private String telefonoDocente;
}
