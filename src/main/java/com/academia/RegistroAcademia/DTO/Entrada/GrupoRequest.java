package com.academia.RegistroAcademia.DTO.Entrada;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GrupoRequest {
    private Long cursoId;
    private Long docenteId;
    private Long cicloId;
    private Long aulaId;
}
