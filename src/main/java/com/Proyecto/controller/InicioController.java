/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.controller;

import com.Proyecto.service.GimnasioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jeausthin
 */
@Controller
@RequestMapping("/gimnasio")
public class InicioController {

    @Autowired
    private GimnasioService gimnasioService;
    
    @GetMapping("/miembros")
    public String inicio(Model model) {
        var miembros = gimnasioService.getMiembros();
        model.addAttribute("miembros", miembros);
        return "/gimnasio/miembros";
    }
}