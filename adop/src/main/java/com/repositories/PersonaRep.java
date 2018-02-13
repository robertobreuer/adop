package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.modelo.Persona;

@Repository
@CrossOrigin(origins="*")
public interface PersonaRep extends JpaRepository<Persona, Long>{
	
}
