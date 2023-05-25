/*package com.ete.sunny.controller;

import com.ete.sunny.model.UserComum;
import com.ete.sunny.model.Usuario;
import com.ete.sunny.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ete.sunny.services.UserService.*;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {
    @Autowired
    private UserService userService;

    @PostMapping("/criar")
    public ResponseEntity<Usuario> criar(UserComum usuario){
        userService.create(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping
    public ResponseEntity<List<Usuario>> findall(){
        return ResponseEntity.ok(userService.findAll());
    }


}*/
