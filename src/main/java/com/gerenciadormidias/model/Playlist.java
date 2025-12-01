package com.gerenciadormidias.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Playlist {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(name = "playlist_midia",
            joinColumns = @JoinColumn(name = "playlist_id"),
            inverseJoinColumns = @JoinColumn(name = "midia_id"))
    private List<Midia> midias;

    @ManyToOne
    private Usuario dono;

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }
    public java.util.List<Midia> getMidias(){ return midias; }
    public void setMidias(java.util.List<Midia> midias){ this.midias = midias; }
    public Usuario getDono(){ return dono; }
    public void setDono(Usuario dono){ this.dono = dono; }
    public void setUsuario(Usuario usuario) {
        this.dono = usuario;
    }
}