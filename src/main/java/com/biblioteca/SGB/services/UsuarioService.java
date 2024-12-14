package com.biblioteca.SGB.services;

import com.biblioteca.SGB.models.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService{

    public boolean logar(Usuario usuario){

        String login = usuario.getLogin();
        String senha = usuario.getSenha();

        if((login.equals("werley")) && (senha.equals("1234"))){

            return true;

        }else{

            return false;

        }

    }

}
