/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Jeausthin
 */
@Data
@Entity
@Table(name = "miembros")
public class GimnasioMiembros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMiembro;

    private String nombre;
    private String apellidos;
    private int numero;
    private String membresia;
    private String metodoPago;
    private String fechaPago;

    public GimnasioMiembros() {
    }

    public GimnasioMiembros(long idMiembro, String nombre, String apellidos, int numero, String membresia, String metodoPago, String fechaPago) {
        this.idMiembro = idMiembro;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = numero;
        this.membresia = membresia;
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
    }
    
    
}
