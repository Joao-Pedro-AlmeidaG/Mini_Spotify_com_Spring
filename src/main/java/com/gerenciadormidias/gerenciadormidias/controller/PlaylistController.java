package com.gerenciadormidias.gerenciadormidias.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.gerenciadormidias.gerenciadormidias.service.PlaylistService;
import com.gerenciadormidias.gerenciadormidias.model.Playlist;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistService service;

    @GetMapping
    public List<Playlist> listar(){ return service.listar(); }

    @PostMapping
    public Playlist criar(@RequestBody Playlist p){ return service.criar(p); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){ service.deletar(id); }
}
