package com.academia.RegistroAcademia.Repository;

import com.academia.RegistroAcademia.Model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository extends JpaRepository<Docente,Long> {
}
