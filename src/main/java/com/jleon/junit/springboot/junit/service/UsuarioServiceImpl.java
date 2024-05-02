package com.jleon.junit.springboot.junit.service;

import com.jleon.junit.springboot.junit.model.Usuario;
import com.jleon.junit.springboot.junit.model.dto.UsuarioResponseDTO;
import com.jleon.junit.springboot.junit.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;
    @Override
    public UsuarioResponseDTO findUsuarioById(Long id) {
        Usuario usu = usuarioRepository.findById(id).orElse(null);
        return usuarioToUsuResponse(usu);

    }

    private UsuarioResponseDTO usuarioToUsuResponse(Usuario u){
        return UsuarioResponseDTO.builder()
                .id(u.getId())
                .nombre(u.getNombre())
                .apellido(u.getApellido())
                .fechaNacimiento(u.getFechaNacimiento())
                .build();

    }
}
