package com.academia.RegistroAcademia.DTO.Entrada;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CursoRequest {
    private String nombreCurso;
    private String descripcionCurso;
    private Long areaId;
}
