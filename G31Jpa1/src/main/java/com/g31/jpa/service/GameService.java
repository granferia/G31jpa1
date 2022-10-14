/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g31.jpa.service;

import com.g31.jpa.entity.Category;
import com.g31.jpa.entity.Client;
import com.g31.jpa.entity.Game;
import com.g31.jpa.entity.Message;
import com.g31.jpa.entity.Reservation;
import com.g31.jpa.repository.GameRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sistemas
 */
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> getGameList() {
        return gameRepository.findAll();
    }

    public Game getGame(Long id) {
        return gameRepository.findById(id).get();
    }

    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Game game) {
        //valido si tiene id  en la informacion de la peticion

        if (game.getId() != null) {
            Optional<Game> opcional = gameRepository.findById(game.getId());
            if (!opcional.isEmpty()) {
                Game gameBD = opcional.get();
                gameBD.setName(game.getName());
                gameBD.setDeveloper(game.getDeveloper());
                gameBD.setDescription(game.getDescription());
                gameBD.setYear(game.getYear());
                gameBD.setCategory(game.getCategory());
                return gameRepository.save(gameBD);

            } else {
                return game;
            }
        }
        return game;
    }

    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
     
}
