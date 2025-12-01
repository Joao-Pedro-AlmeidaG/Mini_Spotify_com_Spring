package com.gerenciadormidias.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadormidias.model.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long> { }
