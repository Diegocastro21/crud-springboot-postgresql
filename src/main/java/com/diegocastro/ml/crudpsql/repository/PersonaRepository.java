package com.diegocastro.ml.crudpsql.repository;

import com.diegocastro.ml.crudpsql.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {



}
