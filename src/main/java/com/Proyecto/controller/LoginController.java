/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.controller;

import com.Proyecto.domain.Gimnasio;
import com.Proyecto.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Jeausthin
 */
@Controller
public class LoginController {

    @Autowired
    private AuthService authService;
    
    @GetMapping("/")
    public String PaginaLogin() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("gimnasio") Gimnasio gimnasio) {
        ModelAndView mav = new ModelAndView();
        if (authService.autenticacion(gimnasio)) {
            mav.setViewName("/Inicio");
        } else {
            mav.setViewName("login");
            mav.addObject("error", "Credenciales inválidas, por favor intenta de nuevo");
        }
        return mav;
    }
}
