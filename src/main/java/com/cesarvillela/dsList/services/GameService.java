package com.cesarvillela.dsList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesarvillela.dsList.dto.GameMinDTO;
import com.cesarvillela.dsList.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }

    // public List<Game> findAll() {
    // return gameRepository.findAll();
    // }
}
