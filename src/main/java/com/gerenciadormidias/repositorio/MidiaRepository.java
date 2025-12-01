package com.gerenciadormidias.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadormidias.model.Midia;

public interface MidiaRepository extends JpaRepository<Midia, Long> { }
