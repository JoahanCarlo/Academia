package com.academia.RegistroAcademia.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombreCurso;
    private String descripcionCurso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area_id",nullable = false)
    private Area area;
}
