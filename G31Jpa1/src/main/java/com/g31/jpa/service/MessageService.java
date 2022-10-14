/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g31.jpa.service;

import com.g31.jpa.entity.Message;
import com.g31.jpa.repository.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sistemas
 */
@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getMessageList() {
        return messageRepository.findAll();
    }

    public Message getMessage(Long id) {
        return messageRepository.findById(id).get();
    }

    public Message saveMesssage(Message message) {
        return messageRepository.save(message);

    }

    public Message updateMessage(Message message) {
        //valido si tiene id  en la informacion de la peticion

        if (message.getIdMessage()!= null) {
            Optional<Message> opcional = messageRepository.findById(message.getIdMessage());
            if (!opcional.isEmpty()) {
                Message messageBD = opcional.get();
                messageBD.setMessageText(message.getMessageText());
                return messageRepository.save(messageBD);

            } else {
                return message;
            }
        }
        return message;
    }

    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }
}
