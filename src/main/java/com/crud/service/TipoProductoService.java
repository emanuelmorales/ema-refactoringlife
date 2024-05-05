package com.crud.service;

import com.crud.model.Marca;
import com.crud.model.TipoProducto;
import com.crud.respository.TipoProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class TipoProductoService {
    @Autowired
    TipoProductoRepository tipoProductoRepository;

    public TipoProducto crearTipoProducto(TipoProducto tipoProducto) {
        return tipoProductoRepository.save(tipoProducto);
    }

    public void eliminarTipoProducto(Long id) {
        tipoProductoRepository.findById(id).ifPresent(tipoProducto -> {
            tipoProducto.setFechaBaja(new Timestamp(System.currentTimeMillis())); // Asignar la fecha y hora actual
            tipoProductoRepository.save(tipoProducto);
        });
    }
}
