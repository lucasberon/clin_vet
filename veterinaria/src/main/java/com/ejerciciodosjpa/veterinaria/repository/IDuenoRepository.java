
package com.ejerciciodosjpa.veterinaria.repository;

import com.ejerciciodosjpa.veterinaria.model.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenoRepository extends JpaRepository<Dueno,Integer>{
    
}
