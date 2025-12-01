package com.gerenciadormidias.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadormidias.model.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> { }
