package com.example.codeclan.frameDataPunishOptimiser.Components;


import com.example.codeclan.frameDataPunishOptimiser.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CSVReader cvsReader;

    public DataLoader (){
    }

    public void run(ApplicationArguments args){


        try{
           cvsReader.runReader();

        }catch(IOException ex){
            System.out.println(ex.getStackTrace());
        }

}}
