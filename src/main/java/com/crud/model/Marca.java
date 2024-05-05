package com.crud.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca")
    private Long id;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "fecha_baja")
    private Timestamp fechabaja;
}
