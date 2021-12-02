package com.example.codeclan.frameDataPunishOptimiser.Controller;

import com.example.codeclan.frameDataPunishOptimiser.Models.Individual;
import com.example.codeclan.frameDataPunishOptimiser.Repository.IndividualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndividualController {
    @Autowired
    IndividualRepository individualRepository;

    @GetMapping(value = "/individuals")
    public ResponseEntity<List<Individual>> getAllIndividuals(){
        return new ResponseEntity<>(individualRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/individuals/{id}")
    public ResponseEntity getIndividualById(@PathVariable Long id){
        return new ResponseEntity(individualRepository.findById(id), HttpStatus.OK);
    }

}
