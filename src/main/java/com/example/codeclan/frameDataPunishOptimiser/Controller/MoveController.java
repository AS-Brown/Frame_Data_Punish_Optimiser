package com.example.codeclan.frameDataPunishOptimiser.Controller;

import com.example.codeclan.frameDataPunishOptimiser.Models.Move;
import com.example.codeclan.frameDataPunishOptimiser.Repository.MoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoveController {
    @Autowired
    MoveRepository moveRepository;

    @GetMapping(value = "/moves")
    public ResponseEntity<List<Move>> getAllMoves(){
        return new ResponseEntity<>(moveRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/moves/{id}")
    public ResponseEntity getMoveById(@PathVariable Long id){
        return new ResponseEntity(moveRepository.findById(id), HttpStatus.OK);
    }
}
