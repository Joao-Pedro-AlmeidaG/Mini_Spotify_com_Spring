package com.gerenciadormidias.gerenciadormidias.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.gerenciadormidias.gerenciadormidias.repositorio.MidiaRepository;
import com.gerenciadormidias.gerenciadormidias.model.Midia;

@Service
public class MidiaService {

    @Autowired
    private MidiaRepository repo;

    public List<Midia> listar(){ return repo.findAll(); }
    public Midia criar(Midia m){ return repo.save(m); }
    public void deletar(Long id){ repo.deleteById(id); }
}
