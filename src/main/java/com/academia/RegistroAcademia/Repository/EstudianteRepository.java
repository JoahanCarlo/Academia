package com.academia.RegistroAcademia.Repository;

import com.academia.RegistroAcademia.Model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
}
