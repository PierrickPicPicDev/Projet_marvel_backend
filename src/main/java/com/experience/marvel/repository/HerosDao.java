package com.experience.marvel.repository;

import com.experience.marvel.model.Heros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HerosDao extends JpaRepository<Heros, Integer> {

    List<Heros> deleteByName(String name);
}
