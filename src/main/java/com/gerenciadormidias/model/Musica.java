package com.gerenciadormidias.model;

import jakarta.persistence.Entity;

@Entity
public class Musica extends Midia {
    private String artista;

    public String getArtista(){ return artista; }
    public void setArtista(String artista){ this.artista = artista; }
}
