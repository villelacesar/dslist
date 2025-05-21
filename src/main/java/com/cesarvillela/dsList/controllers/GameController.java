package com.cesarvillela.dsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarvillela.dsList.dto.GameMinDTO;
import com.cesarvillela.dsList.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    // @GetMapping
    // List<Game> findAll() {
    // return gameService.findAll();
    // }

}
