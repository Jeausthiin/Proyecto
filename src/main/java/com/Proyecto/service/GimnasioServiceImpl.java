/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.dao.GimnasioDao;
import com.Proyecto.domain.GimnasioMiembros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author johan
 */

@Service
public class GimnasioServiceImpl implements GimnasioService {

    
    
    @Autowired
    private GimnasioDao clienteDao;
    

    @Override
    public List<GimnasioMiembros> getMiembros() {
        return (List<GimnasioMiembros>) clienteDao.findAll();
    }

    @Override
    public void save(GimnasioMiembros miembro) {
        clienteDao.save(miembro);
    }

    @Override
    public void delete(GimnasioMiembros miembro) {
        clienteDao.delete(miembro);
    }

    @Override
    public GimnasioMiembros getMiembro(GimnasioMiembros miembro) {
        return clienteDao.findById(miembro.getIdMiembro()).orElse(null);
    }
    
}
