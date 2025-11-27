package com.gerenciadormidias.gerenciadormidias.model;

import jakarta.persistence.Entity;

@Entity
public class Audiobook extends Midia {
    private String narrador;

    public String getNarrador(){ return narrador; }
    public void setNarrador(String narrador){ this.narrador = narrador; }
}