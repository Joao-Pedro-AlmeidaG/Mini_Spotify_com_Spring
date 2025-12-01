package com.gerenciadormidias.service;

import com.gerenciadormidias.model.Midia;
import com.gerenciadormidias.repositorio.MidiaRepository;
import com.gerenciadormidias.repositorio.PlaylistRepository;
import com.gerenciadormidias.model.Usuario;
import com.gerenciadormidias.repositorio.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.gerenciadormidias.model.Playlist;

@Service
public class PlaylistService {

    @Autowired
    private final PlaylistRepository repo;
    private final UsuarioRepository usuarioRepo;
    private final MidiaRepository midiaRepo;

    public PlaylistService(PlaylistRepository repo, UsuarioRepository usuarioRepo, MidiaRepository midiaRepo) {
        this.repo = repo;
        this.usuarioRepo = usuarioRepo;
        this.midiaRepo = midiaRepo;
    }

    public List<Playlist> listar(){ return repo.findAll(); }
    public Playlist criar(Playlist p){ return repo.save(p); }
    public void deletar(Long id){ repo.deleteById(id); }
    public Playlist adicionarUsuario(Long playlistId, Long usuarioId) {
        Playlist p = repo.findById(playlistId).orElseThrow();
        Usuario u = usuarioRepo.findById(usuarioId).orElseThrow();
        p.setUsuario(u);
        return repo.save(p);
    }
    public Playlist adicionarMidia(Long playlistId, Long midiaId) {
        Playlist p = repo.findById(playlistId).orElseThrow();
        Midia m = midiaRepo.findById(midiaId).orElseThrow();
        p.getMidias().add(m);
        return repo.save(p);
    }
}
