package com.experience.marvel.model;

import javax.persistence.*;

@Entity
@Table(name = "characters")
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

    public Heros() {
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

}
