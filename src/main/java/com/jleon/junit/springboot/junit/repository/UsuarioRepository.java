package com.jleon.junit.springboot.junit.repository;

import com.jleon.junit.springboot.junit.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
