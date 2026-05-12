package com.academia.RegistroAcademia.Repository;

import com.academia.RegistroAcademia.Model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula,Long> {
    List<Matricula> findByEstadoTrue();
}
