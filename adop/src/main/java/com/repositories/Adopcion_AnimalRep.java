package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins="*")
public interface Adopcion_AnimalRep extends JpaRepository<Adopcion_AnimalRep, Long>{

}
