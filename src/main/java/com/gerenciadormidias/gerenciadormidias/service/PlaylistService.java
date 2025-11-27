package com.gerenciadormidias.gerenciadormidias.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.gerenciadormidias.gerenciadormidias.repositorio.PlaylistRepository;
import com.gerenciadormidias.gerenciadormidias.model.Playlist;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository repo;

    public List<Playlist> listar(){ return repo.findAll(); }
    public Playlist criar(Playlist p){ return repo.save(p); }
    public void deletar(Long id){ repo.deleteById(id); }
}
