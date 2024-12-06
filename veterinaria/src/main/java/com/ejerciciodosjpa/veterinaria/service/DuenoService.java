package com.ejerciciodosjpa.veterinaria.service;

import com.ejerciciodosjpa.veterinaria.dto.MascotaDuenoDTO;
import com.ejerciciodosjpa.veterinaria.model.Dueno;
import com.ejerciciodosjpa.veterinaria.repository.IDuenoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenoService implements IDuenoService {

    @Autowired
    private IDuenoRepository duenoRepository;

    @Override
    public List<Dueno> getDuenos() {
        List<Dueno> listaDuenos = duenoRepository.findAll();
        return listaDuenos;
    }

    @Override
    public void saveDueno(Dueno dueno) {
        duenoRepository.save(dueno);
    }

    @Override
    public void deleteDueno(Integer id_dueno) {
        duenoRepository.deleteById(id_dueno);
    }

    @Override
    public Dueno findDueno(Integer id_dueno) {
        Dueno dueno = duenoRepository.findById(id_dueno).orElse(null);
        return dueno;
    }

    @Override
    public void editDueno(Dueno dueno) {
        this.saveDueno(dueno);
    }

    @Override
    public List<MascotaDuenoDTO> getMascotasDuenos() {
        
        List<Dueno> listaDuenos = this.getDuenos();
        List<MascotaDuenoDTO> listaMascotasDueno = new ArrayList<MascotaDuenoDTO>();
        MascotaDuenoDTO mascoDuenoDTO = new MascotaDuenoDTO();
        
        for(Dueno dueno : listaDuenos){
            mascoDuenoDTO.setNombre_mascota(dueno.getMascota().getNombre());
            mascoDuenoDTO.setNombre_dueno(dueno.getNombre());
            mascoDuenoDTO.setApellido_dueno(dueno.getApellido());
            mascoDuenoDTO.setRaza(dueno.getMascota().getRaza());
            mascoDuenoDTO.setEspecie(dueno.getMascota().getEspecie());
            
            listaMascotasDueno.add(mascoDuenoDTO);
            mascoDuenoDTO = new MascotaDuenoDTO();
        }
        return listaMascotasDueno;
    }

    

}
