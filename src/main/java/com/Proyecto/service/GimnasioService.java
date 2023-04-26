/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.domain.GimnasioMiembros;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan
 */
public interface GimnasioService {
    
    public List<GimnasioMiembros> listaMiembros=new ArrayList<>();
    
    public List<GimnasioMiembros> getMiembros();
    
    public void save(GimnasioMiembros miembro);
    
    public void delete(GimnasioMiembros miembro);
    
    public GimnasioMiembros getMiembro(GimnasioMiembros miembro);
}