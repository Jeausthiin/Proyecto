
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
@Table(name = "entrenador")
public class GimnasioEntrenadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEntrenador;

    private String nombre;
    private String apellidos;
    private int numero;
    private String direccion;
    private int edad;

    public GimnasioEntrenadores() {
    }

    public GimnasioEntrenadores(long idEntrenador, String nombre, String apellidos, int numero, String direccion, int edad) {
        this.idEntrenador = idEntrenador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = numero;
        this.direccion = direccion;
        this.edad = edad;
    }

   
    
}