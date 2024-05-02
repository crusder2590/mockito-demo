package com.jleon.junit.springboot.junit.service;

import com.jleon.junit.springboot.junit.model.dto.UsuarioResponseDTO;

public interface UsuarioService {

    UsuarioResponseDTO findUsuarioById(Long id);
}
