/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.domain.Gimnasio;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jeausthin
 */
@Service
public class AuthService {
    public boolean autenticacion(Gimnasio gimnasio) {
        // Lógica de autenticación
        return gimnasio.getUsername().equals("admin") && gimnasio.getPassword().equals("admin");
    }
}
