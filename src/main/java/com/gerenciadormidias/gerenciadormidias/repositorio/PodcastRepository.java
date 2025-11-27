package com.gerenciadormidias.gerenciadormidias.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadormidias.gerenciadormidias.model.Podcast;

public interface PodcastRepository extends JpaRepository<Podcast, Long> { }
