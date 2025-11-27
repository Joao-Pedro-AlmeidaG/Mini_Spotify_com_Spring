package com.gerenciadormidias.gerenciadormidias.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadormidias.gerenciadormidias.model.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> { }
