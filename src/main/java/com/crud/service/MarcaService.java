package com.crud.service;

import com.crud.model.Marca;
import com.crud.respository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> obtenerTodasMarca() {
        return marcaRepository.findByFechabajaIsNull();
    }

    public Marca crearMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public Marca actualizarMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public void eliminarMarca(Long id) {
        marcaRepository.findById(id).ifPresent(marca -> {
            marca.setFechabaja(new Timestamp(System.currentTimeMillis())); // Asignar la fecha y hora actual
            marcaRepository.save(marca);
        });
    }
}
