package com.academia.RegistroAcademia.DTO.Salida;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteResponse {
    private Long id;
    private String dniEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private Date fechaNacimiento;
    private String telefonoEstudiante;
    private String colegioEstudiante;
}
