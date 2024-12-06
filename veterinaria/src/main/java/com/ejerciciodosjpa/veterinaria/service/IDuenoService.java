package com.ejerciciodosjpa.veterinaria.service;

import com.ejerciciodosjpa.veterinaria.dto.MascotaDuenoDTO;
import com.ejerciciodosjpa.veterinaria.model.Dueno;
import java.util.List;

public interface IDuenoService {

    public List<Dueno> getDuenos();

    public void saveDueno(Dueno dueno);

    public void deleteDueno(Integer id_dueno);

    public Dueno findDueno(Integer id_dueno);

    public void editDueno(Dueno dueno);
    
    public List<MascotaDuenoDTO> getMascotasDuenos();
    
    

}
