package com.cesarvillela.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarvillela.dsList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    // Custom query methods can be defined here if needed

}
