
package com.ejerciciodosjpa.veterinaria.controller;

import com.ejerciciodosjpa.veterinaria.dto.MascotaDuenoDTO;
import com.ejerciciodosjpa.veterinaria.model.Mascota;
import com.ejerciciodosjpa.veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService mascotaService;
    
    @GetMapping("/mascotas/traer")
    public List<Mascota> getMascotas(){
        return mascotaService.getMascotas();
    }
    
    @GetMapping("/mascotas/traercaniches")
    public List<Mascota> getCaniches(){
        return mascotaService.getPerrosCaniches();
    }
    
    @PostMapping("/mascotas/crear")
    public void saveMascota(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);
    }
    
    @DeleteMapping("/mascotas/borrar/{id_mascota}")
    public String deleteMascota(@PathVariable Integer id_mascota){
        mascotaService.deleteMascota(id_mascota);
        return "La mascota fue eliminada correctamente";
    }
    
    @PutMapping("mascotas/editar")
    public Mascota editMascotas(@RequestBody Mascota mascota){
        mascotaService.editMascota(mascota);
        return mascotaService.findMascota(mascota.getId_mascota());
    }
    
    
    
    
    
}
