package com.gerenciadormidias.gerenciadormidias.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "dono")
    private List<Playlist> playlists;

    @OneToOne
    private Playlist playlistPrincipal;

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }
    public List<Playlist> getPlaylists(){ return playlists; }
    public void setPlaylists(List<Playlist> playlists){ this.playlists = playlists; }
    public Playlist getPlaylistPrincipal(){ return playlistPrincipal; }
    public void setPlaylistPrincipal(Playlist playlistPrincipal){ this.playlistPrincipal = playlistPrincipal; }
}