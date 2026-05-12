package com.academia.RegistroAcademia.Repository;

import com.academia.RegistroAcademia.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Long> {
}
