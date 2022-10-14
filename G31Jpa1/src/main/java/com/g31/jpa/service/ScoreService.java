/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g31.jpa.service;

import com.g31.jpa.entity.Score;
import com.g31.jpa.repository.ScoreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sistemas
 */
@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;
    
    public List<Score> getScore(){
        return scoreRepository.findAll();
    }
    
    public Score getScoreById(Long idScore){
        return scoreRepository.findById(idScore).get();
    }
    
    public Score saveScore(Score score){
        return scoreRepository.save(score);
    }
}

