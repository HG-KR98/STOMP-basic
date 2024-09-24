package com.example.chat.controller;

import com.example.chat.dto.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/lobby")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }
}
