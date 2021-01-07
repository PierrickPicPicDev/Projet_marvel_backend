package com.experience.marvel.repository;

import com.experience.marvel.model.SuperTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperTeamDao extends JpaRepository<SuperTeam, Integer> {
}
