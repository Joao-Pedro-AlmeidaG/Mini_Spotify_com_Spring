package com.gerenciadormidias.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadormidias.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> { }