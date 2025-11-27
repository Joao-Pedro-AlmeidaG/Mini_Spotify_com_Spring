package com.gerenciadormidias.gerenciadormidias.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "tipo"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Musica.class, name = "musica"),
        @JsonSubTypes.Type(value = Podcast.class, name = "podcast"),
        @JsonSubTypes.Type(value = Audiobook.class, name = "audiobook")
})
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Midia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String genero;

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }
    public String getTitulo(){ return titulo; }
    public void setTitulo(String titulo){ this.titulo = titulo; }
    public String getGenero(){ return genero; }
    public void setGenero(String genero){ this.genero = genero; }
}