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
 * @author Jeausthin
 */
@Service
public class GimnasioServiceImpl implements GimnasioService {

    @Autowired
    private GimnasioDao gimnasioDao;

    @Override
    public List<GimnasioMiembros> getMiembros() {
        return (List<GimnasioMiembros>) gimnasioDao.findAll();
    }

    @Override
    public void saveMiembro(GimnasioMiembros miembro) {
        gimnasioDao.save(miembro);
    }

}
