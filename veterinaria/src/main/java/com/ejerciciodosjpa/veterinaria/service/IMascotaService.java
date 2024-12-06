package com.ejerciciodosjpa.veterinaria.service;

import com.ejerciciodosjpa.veterinaria.dto.MascotaDuenoDTO;
import com.ejerciciodosjpa.veterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {

    public List<Mascota> getMascotas();

    public void saveMascota(Mascota mascota);

    public void deleteMascota(Integer id_mascota);

    public Mascota findMascota(Integer id_mascota);

    public void editMascota(Mascota mascota);
    
    public List<Mascota> getPerrosCaniches();

}
