package com.cesarvillela.dsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarvillela.dsList.dto.GameDTO;
import com.cesarvillela.dsList.dto.GameMinDTO;
import com.cesarvillela.dsList.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findbyId(id);
    }

    // @GetMapping
    // List<Game> findAll() {
    // return gameService.findAll();
    // }

}
