/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g31.jpa.controller;

import com.g31.jpa.entity.Client;
import com.g31.jpa.entity.Message;
import com.g31.jpa.entity.Reservation;
import com.g31.jpa.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sistemas
 */
@RestController()
@RequestMapping("/Client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getClient() {
        return clientService.getClientList();
    }

    @GetMapping("/{id}")
    public Client getClientID(@PathVariable("id") Long id) {
        return clientService.getClient(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteClient(@PathVariable("id") Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.status(204).build();
    }
    
    @PostMapping("/save")
    public ResponseEntity insertMessage(@RequestBody Client client) {
        clientService.insertClient(client);
        return ResponseEntity.status(201).build();
    }
   
 
    
}
