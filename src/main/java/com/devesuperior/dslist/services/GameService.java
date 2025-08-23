package com.devesuperior.dslist.services;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.projections.GameMinProjection;
import com.devesuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){

        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;

    }

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
            return result.stream().map(GameMinDTO::new).toList();


    }public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
            return result.stream().map(GameMinDTO::new).toList();
    }


}
