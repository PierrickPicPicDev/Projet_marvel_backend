package com.experience.marvel.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "heros")
public class Heros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_heros;

    @Column(name = "name")
    private String name;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "description")
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "hero_comic",
            joinColumns = @JoinColumn(name = "id_heros"),
            inverseJoinColumns = @JoinColumn(name = "id_comic"))
    private List<Comic> comics;

    public Heros() {
        this.comics = new ArrayList<>();
    }

    public Integer getId_heros() {
        return id_heros;
    }

    public void setId_heros(Integer id_heros) {
        this.id_heros = id_heros;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Comic> getComics() {
        return comics;
    }

    public void setComics(List<Comic> comics) {
        this.comics = comics;
    }
}
