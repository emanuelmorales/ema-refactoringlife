package com.crud.controller;

import com.crud.model.Marca;
import com.crud.model.TipoProducto;
import com.crud.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tipoProducto")
public class TipoProductoController {
    @Autowired
    private TipoProductoService tipoProductoService;

    @PostMapping("/crear")
    public ResponseEntity<TipoProducto> crear(@RequestBody TipoProducto tipoProducto) {
        TipoProducto createdTipoProducto = tipoProductoService.crearTipoProducto(tipoProducto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTipoProducto);
    }

    @PatchMapping("/eliminar/{id}")
    public ResponseEntity<TipoProducto> eliminar(@PathVariable Long id) {
        tipoProductoService.eliminarTipoProducto(id);
        return ResponseEntity.noContent().build();
    }
}
