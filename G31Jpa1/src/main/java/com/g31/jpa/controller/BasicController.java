/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g31.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sistemas
 */
@RestController
@RequestMapping("/basic")
public class BasicController {

    //metodos 
    @GetMapping("/greet")
    public String greeting() {
        return "hola bienv enido a spring boot tonto";
    }

    @GetMapping("/greet/{usuario}")
    public String greetingParam(@PathVariable("usuario") String usuario) {
        return "hola " + usuario + " bienvenido a spring boot";
    }
}
