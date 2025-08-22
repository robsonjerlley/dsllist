package com.devesuperior.dslist.services;

import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
            return result;
    }


}
