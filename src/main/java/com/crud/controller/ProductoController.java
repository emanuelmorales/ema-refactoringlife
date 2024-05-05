package com.crud.controller;

import com.crud.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/prueba")
    public String Crud	(){

        return "Refactoring life - Backend Productos";
    }
}
