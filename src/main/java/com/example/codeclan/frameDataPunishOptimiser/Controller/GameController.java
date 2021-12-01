package com.example.codeclan.frameDataPunishOptimiser.Controller;

import com.example.codeclan.frameDataPunishOptimiser.Models.Game;
import com.example.codeclan.frameDataPunishOptimiser.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {
    @Autowired
    GameRepository gameRepository;

    @GetMapping(value = "/games")
    public ResponseEntity<List<Game>> getAllGames(){
        return new ResponseEntity<>(gameRepository.findAll(), HttpStatus.OK);
    }
}
