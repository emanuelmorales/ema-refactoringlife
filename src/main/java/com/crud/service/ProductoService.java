package com.crud.service;

import com.crud.model.Producto;
import com.crud.respository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodosProductos() {
        return productoRepository.findAll();
    }

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto actualizarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public void eliminarProducto(Long id){
        productoRepository.deleteById(id);
    }
}
