package com.experience.marvel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "comic")
public class Comic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_comic;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "comics", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("comics")
    private List<Heros> herosList;

    public Comic() {
        this.herosList = new ArrayList<>();
    }

    public Integer getId_comic() {
        return id_comic;
    }

    public void setId_comic(Integer id_comic) {
        this.id_comic = id_comic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Heros> getHerosList() {
        return herosList;
    }

    public void setHerosList(List<Heros> herosList) {
        this.herosList = herosList;
    }
}
