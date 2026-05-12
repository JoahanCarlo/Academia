package com.academia.RegistroAcademia.DTO.Salida;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaResponse {
    private Long id;
    private String nombreEstudiante;
    private String nombreArea;
    private String nombreCurso;
    private String nombreCiclo;
    protected String nombreAula;
}
