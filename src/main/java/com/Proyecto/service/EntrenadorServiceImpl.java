/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.dao.EntrenadorDao;
import com.Proyecto.domain.GimnasioEntrenadores;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author johan
 */
public class EntrenadorServiceImpl implements EntrenadorService{
    
    @Autowired
    private EntrenadorDao clienteDao;

    @Override
    public List<GimnasioEntrenadores> getEntrenadores() {
        return (List<GimnasioEntrenadores>) clienteDao.findAll();
    }

    @Override
    public void save(GimnasioEntrenadores entrenador) {
        clienteDao.save(entrenador);
    }

    @Override
    public void delete(GimnasioEntrenadores entrenador) {
        clienteDao.delete(entrenador);
    }

    @Override
    public GimnasioEntrenadores getEntrenador(GimnasioEntrenadores entrenador) {
        return clienteDao.findById(entrenador.getIdEntrenador()).orElse(null);
    }
    

   

    
    
}
