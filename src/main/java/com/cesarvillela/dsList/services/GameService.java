package com.cesarvillela.dsList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cesarvillela.dsList.dto.GameDTO;
import com.cesarvillela.dsList.dto.GameMinDTO;
import com.cesarvillela.dsList.projections.GameMinProjection;
import com.cesarvillela.dsList.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findbyId(Long id) {
        return new GameDTO(gameRepository.findById(id).get());
    }

    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
    // public List<Game> findAll() {
    // return gam eRepository.findAll();
    // }
}
