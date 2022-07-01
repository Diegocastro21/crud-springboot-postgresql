package com.diegocastro.ml.crudpsql.repositorio;

import com.diegocastro.ml.crudpsql.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
