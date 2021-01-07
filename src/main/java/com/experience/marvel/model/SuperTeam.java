package com.experience.marvel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "superteam")
public class SuperTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_superteam;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "superteam", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties("superteam")
    private List<Heros> teamOfHeros;

    public SuperTeam() {
    }

    public Integer getId_superteam() {
        return id_superteam;
    }

    public void setId_superteam(Integer id_superteam) {
        this.id_superteam = id_superteam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Heros> getTeamOfHeros() {
        return teamOfHeros;
    }

    public void setTeamOfHeros(List<Heros> teamOfHeros) {
        this.teamOfHeros = teamOfHeros;
    }
}
