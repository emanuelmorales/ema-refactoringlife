package com.crud.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "tipo_producto")
public class TipoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_producto")
    private Long idTipoProducto;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha_baja")
    private Timestamp fechaBaja;
}
