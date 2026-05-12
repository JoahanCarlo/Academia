package com.academia.RegistroAcademia.Model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Pattern(
            regexp = "\\d{8}",
            message = "El DNI debe tener 8 dígitos"
    )
    @Column(unique = true,nullable = false)
    private String dniEstudiante;

    private String nombreEstudiante;
    private String apellidoEstudiante;
    private Date fechaNacimiento;
    private String telefonoEstudiante;
    private String colegioEstudiante;
    private Boolean estado;
}
