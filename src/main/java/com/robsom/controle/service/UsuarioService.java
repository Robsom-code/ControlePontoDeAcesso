package com.robsom.controle.service;


import com.robsom.controle.model.Usuario;
import com.robsom.controle.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll(){return usuarioRepository.findAll(); }

    public Optional<Usuario> getById(Long idUsuario){return usuarioRepository.findById(idUsuario);}

    public Usuario updaUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long idUsuario){usuarioRepository.deleteById(idUsuario);}



}
