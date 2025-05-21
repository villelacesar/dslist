package com.cesarvillela.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarvillela.dsList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
