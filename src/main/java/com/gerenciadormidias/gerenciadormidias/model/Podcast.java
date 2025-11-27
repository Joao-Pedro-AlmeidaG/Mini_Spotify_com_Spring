package com.gerenciadormidias.gerenciadormidias.model;

import jakarta.persistence.*;

@Entity
public class Podcast extends Midia {
    private String host;

    @ManyToOne
    private Usuario criador;

    public String getHost(){ return host; }
    public void setHost(String host){ this.host = host; }

    public Usuario getCriador(){ return criador; }
    public void setCriador(Usuario criador){ this.criador = criador; }
}