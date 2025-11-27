package com.gerenciadormidias.gerenciadormidias.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadormidias.gerenciadormidias.model.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long> { }
