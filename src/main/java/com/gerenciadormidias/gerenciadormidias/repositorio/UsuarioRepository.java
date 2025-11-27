package com.gerenciadormidias.gerenciadormidias.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadormidias.gerenciadormidias.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> { }