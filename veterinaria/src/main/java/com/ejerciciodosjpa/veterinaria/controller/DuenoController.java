
package com.ejerciciodosjpa.veterinaria.controller;

import com.ejerciciodosjpa.veterinaria.dto.MascotaDuenoDTO;
import com.ejerciciodosjpa.veterinaria.model.Dueno;
import com.ejerciciodosjpa.veterinaria.service.IDuenoService;
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
public class DuenoController {
    
    @Autowired
    private IDuenoService duenoService;
    
    @GetMapping("/duenos/traer")
    public List<Dueno> getDuenos(){
        return duenoService.getDuenos();
    }
    
    @PostMapping("/duenos/crear")
    public void saveDueno(@RequestBody Dueno dueno){
        duenoService.saveDueno(dueno);
    }
    
    @DeleteMapping("/duenos/borrar/{id_dueno}")
    public String deleteDueno(@PathVariable Integer id_dueno){
        duenoService.deleteDueno(id_dueno);
        return "El dueño fue eliminado correctamente";
    }
    
    @PutMapping("duenos/editar")
    public Dueno editDueno(@RequestBody Dueno dueno){
        duenoService.editDueno(dueno);
        return duenoService.findDueno(dueno.getId_dueno());
    }
    
    @GetMapping ("duenos/traerduenos")
    public List<MascotaDuenoDTO> traerMascotaDuenos () {
        return duenoService.getMascotasDuenos();
    
    }
    
    
    
    
    
    
    
    
    
}
