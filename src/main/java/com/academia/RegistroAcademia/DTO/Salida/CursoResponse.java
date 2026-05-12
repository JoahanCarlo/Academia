package com.academia.RegistroAcademia.DTO.Salida;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursoResponse {
    private Long id;
    private String nombreCurso;
    private String descripcionCurso;
    private String nombreArea;
}
