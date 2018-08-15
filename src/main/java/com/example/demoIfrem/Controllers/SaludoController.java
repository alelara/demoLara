/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.demoIfrem.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alara
 */

@RestController
public class SaludoController {
    
    @GetMapping(value="/mensaje")
    public String mensaje(){
        return "Bienvenido a spring boot lara! =) ";
    }
}
