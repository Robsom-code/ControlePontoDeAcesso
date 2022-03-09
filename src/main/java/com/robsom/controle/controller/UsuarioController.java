package com.robsom.controle.controller;


import com.robsom.controle.model.Usuario;
import com.robsom.controle.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> getUsuarioList() {
        return usuarioService.findAll();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> getUsuarioByID(@PathVariable("idUsuario") Long idUsuario) throws Exception {
        return ResponseEntity.ok(usuarioService.getById(idUsuario).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        return usuarioService.updaUsuario(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity deleteById(@PathVariable("idUsuario") Long idUsuario) throws Exception {
        try {
            usuarioService.deleteUsuario(idUsuario);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Usuario>) ResponseEntity.ok();
    }
}
