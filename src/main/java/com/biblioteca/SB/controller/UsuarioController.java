package com.biblioteca.SB.controller;

import com.biblioteca.SB.models.Usuario;

import com.biblioteca.SB.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController{

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public String logar(@RequestBody Usuario usuario){

        if(usuarioService.logar(usuario)){

            return "LOGADO";

        }else{

            return "ERRO!";
        }

    }

}
