/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.g31.jpa.repository;

import com.g31.jpa.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sistemas
 */
public interface GameRepository extends JpaRepository<Game, Long>{
    
}
