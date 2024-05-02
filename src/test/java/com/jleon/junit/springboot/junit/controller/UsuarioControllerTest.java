package com.jleon.junit.springboot.junit.controller;

import com.jleon.junit.springboot.junit.model.dto.UsuarioResponseDTO;
import com.jleon.junit.springboot.junit.service.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class UsuarioControllerTest {

    @Mock
    private UsuarioService usuarioService;

    @InjectMocks
    private UsuarioController usuarioController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getUsuariosReturnsUserWhenUserExists() {
        UsuarioResponseDTO expectedUser = new UsuarioResponseDTO();
        when(usuarioService.findUsuarioById(3L)).thenReturn(expectedUser);

        ResponseEntity<UsuarioResponseDTO> response = usuarioController.getUsuarios(3L);

        assertEquals(ResponseEntity.ok(expectedUser), response);
    }

    @Test
    void getUsuariosReturnsNotFoundWhenUserDoesNotExist() {
        when(usuarioService.findUsuarioById(1L)).thenReturn(null);

        ResponseEntity<UsuarioResponseDTO> response = usuarioController.getUsuarios(1L);

        assertEquals(ResponseEntity.notFound().build(), response);
    }
}
