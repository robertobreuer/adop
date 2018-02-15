package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.modelo.Adopcion_Animal;
import com.modelo.Adopcion_Animal;

@Repository
@CrossOrigin(origins="*")
public interface Adopcion_AnimalRep extends JpaRepository<Adopcion_Animal, Long>{

	List<Adopcion_Animal> findByRaza(String raza);
	List<Adopcion_Animal> findByEdadDias(long edad);
	List<Adopcion_Animal> findByDiscapacidad(String discapacidad);
}
