package com.academia.RegistroAcademia.DTO.Salida;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocenteResponse {
    private Long id;
    private String dniDocente;
    private String nombreDocente;
    private String apellidoDocente;
    private String telefonoDocente;
}
