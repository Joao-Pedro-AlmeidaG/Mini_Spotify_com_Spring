package com.gerenciadormidias.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.gerenciadormidias.service.PlaylistService;
import com.gerenciadormidias.model.Playlist;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    @PutMapping("/{playlistId}/usuario/{usuarioId}")
    public Playlist adicionarUsuario(
            @PathVariable Long playlistId,
            @PathVariable Long usuarioId
    ) {
        return service.adicionarUsuario(playlistId, usuarioId);
    }
    @PutMapping("/{playlistId}/midia/{midiaId}")
    public Playlist adicionarMidia(
            @PathVariable Long playlistId,
            @PathVariable Long midiaId
    ) {
        return service.adicionarMidia(playlistId, midiaId);
    }
    @Autowired
    private PlaylistService service;

    @GetMapping
    public List<Playlist> listar(){ return service.listar(); }

    @PostMapping
    public Playlist criar(@RequestBody Playlist p){ return service.criar(p); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){ service.deletar(id); }
}
