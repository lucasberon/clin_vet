package com.ejerciciodosjpa.veterinaria.service;

import com.ejerciciodosjpa.veterinaria.dto.MascotaDuenoDTO;
import com.ejerciciodosjpa.veterinaria.model.Mascota;
import com.ejerciciodosjpa.veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = mascotaRepository.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Integer id_mascota) {
        mascotaRepository.deleteById(id_mascota);
    }

    @Override
    public Mascota findMascota(Integer id_mascota) {
        Mascota mascota = mascotaRepository.findById(id_mascota).orElse(null);
        return mascota;
    }

    @Override
    public void editMascota(Mascota mascota) {
        this.saveMascota(mascota);
    }

    @Override
    public List<Mascota> getPerrosCaniches() {

        String palabraPerro = "Perro";
        String palabraCaniche = "Caniche";
        String compararEspecie;
        String compararRaza;

        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaPerrosCaniches = new ArrayList<Mascota>();

        for (Mascota mascota : listaMascotas) {
            compararEspecie = mascota.getEspecie();
            compararRaza = mascota.getRaza();
            boolean contieneAmbos = compararEspecie.contains(palabraPerro) && compararRaza.contains(palabraCaniche);
            if (contieneAmbos == true) {
                listaPerrosCaniches.add(mascota);
            }

        }
        return listaPerrosCaniches;
    }

}
