package com.crud.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "id_marca", nullable = false)
    private Long idMarca;
    @Column(name = "fecha_baja")
    private Timestamp fechaBaja;
    @Column(name = "id_tipo_producto")
    private Long idTipoProducto;
}
