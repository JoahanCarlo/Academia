package com.academia.RegistroAcademia.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Pattern;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Pattern(
            regexp = "\\d{8}",
            message = "El DNI debe tener 8 dígitos"
    )
    @Column(unique = true,nullable = false)
    private String dniDocente;

    private String nombreDocente;
    private String apellidoDocente;
    private String telefonoDocente;
}
