/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.domain.GimnasioEntrenadores;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan
 */
public interface EntrenadorService {
    
    public List<GimnasioEntrenadores> listaEntrenadores=new ArrayList<>();
    
    public List<GimnasioEntrenadores> getEntrenadores();
    
    public void save(GimnasioEntrenadores entrenador);
    
    public void delete(GimnasioEntrenadores entrenador);
    
    public GimnasioEntrenadores getEntrenador(GimnasioEntrenadores entrenador);
}
