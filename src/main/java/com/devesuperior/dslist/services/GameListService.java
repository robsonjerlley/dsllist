package com.devesuperior.dslist.services;

import com.devesuperior.dslist.dto.GameListDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.entities.GameList;
import com.devesuperior.dslist.repositories.GameListRepository;
import com.devesuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    public List<GameListDTO> findAll(){

        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();

    }



}
