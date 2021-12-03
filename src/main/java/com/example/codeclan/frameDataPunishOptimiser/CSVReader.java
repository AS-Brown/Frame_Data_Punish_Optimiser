package com.example.codeclan.frameDataPunishOptimiser;

import com.example.codeclan.frameDataPunishOptimiser.Models.Individual;
import com.example.codeclan.frameDataPunishOptimiser.Models.Game;
import com.example.codeclan.frameDataPunishOptimiser.Models.Move;
import com.example.codeclan.frameDataPunishOptimiser.Repository.IndividualRepository;
import com.example.codeclan.frameDataPunishOptimiser.Repository.GameRepository;
import com.example.codeclan.frameDataPunishOptimiser.Repository.MoveRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class CSVReader {
    @Autowired
    IndividualRepository individualRepository;

    @Autowired
    GameRepository gameRepository;

    @Autowired
    MoveRepository moveRepository;

    private String Names_CSV = "/Users/codeclanstudent/Desktop/g27/codeclan_work/final_project/frameDataPunishOptimiser/src/main/resources/static/misc/names.csv";

    public void runReader() throws IOException {
        try (

                Reader nameReader = Files.newBufferedReader(Paths.get(Names_CSV));
                CSVParser csvParserOfNames = new CSVParser(nameReader, CSVFormat.DEFAULT
                            .withFirstRecordAsHeader()
                            .withIgnoreHeaderCase()
                            .withTrim());
            ) {
            Game BBCF = new Game("BBCF");
            gameRepository.save(BBCF);
                for(CSVRecord csvRecordOfNames : csvParserOfNames){
                    String name = csvRecordOfNames.get("name");
                    String Moves_CSV = "/Users/codeclanstudent/Desktop/g27/codeclan_work/final_project/frameDataPunishOptimiser/src/main/resources/static/characters/" + name + ".csv";
                    Reader reader = Files.newBufferedReader(Paths.get(Moves_CSV));
                    CSVParser csvParserOfMoves = new CSVParser(reader, CSVFormat.DEFAULT
                            .withFirstRecordAsHeader()
                            .withIgnoreHeaderCase()
                            .withTrim());

                    Individual currentCharacter = new Individual(name, BBCF);
                    individualRepository.save(currentCharacter);

                    for (CSVRecord csvRecordOfMoves : csvParserOfMoves){

                        String input = csvRecordOfMoves.get("Move");
                        String startup = csvRecordOfMoves.get("Startup");
                        String active = csvRecordOfMoves.get("Active");
                        String recovery = csvRecordOfMoves.get("Recovery");
                        String frameAdvantage = csvRecordOfMoves.get("FrameAdvantage");

                        Move currentMove = new Move(input, Integer.parseInt(startup), active, Integer.parseInt(recovery), Integer.parseInt(frameAdvantage), currentCharacter);
                        moveRepository.save(currentMove);
                    }
                }
            }
        }
}
