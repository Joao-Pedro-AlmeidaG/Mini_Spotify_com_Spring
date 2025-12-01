package com.gerenciadormidias.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Playlist {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JsonManagedReference
    @JoinTable(name = "playlist_midia",
            joinColumns = @JoinColumn(name = "playlist_id"),
            inverseJoinColumns = @JoinColumn(name = "midia_id"))
    private List<Midia> midias;

    @ManyToOne
    @JsonBackReference
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