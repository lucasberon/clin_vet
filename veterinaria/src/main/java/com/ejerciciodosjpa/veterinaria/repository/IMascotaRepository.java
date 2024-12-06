
package com.ejerciciodosjpa.veterinaria.repository;

import com.ejerciciodosjpa.veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota,Integer>{
    
}
