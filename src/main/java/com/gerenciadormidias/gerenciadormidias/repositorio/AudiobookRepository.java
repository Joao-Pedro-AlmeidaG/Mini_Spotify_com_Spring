package com.gerenciadormidias.gerenciadormidias.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadormidias.gerenciadormidias.model.Audiobook;

public interface AudiobookRepository extends JpaRepository<Audiobook, Long> { }
