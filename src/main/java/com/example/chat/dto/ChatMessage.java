package com.example.chat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    private String content;
    private String sender;
    private String timeStamp;

    public ChatMessage(String content, String sender, String timeStamp) {
        this.content = content;
        this.sender = sender;
        this.timeStamp = timeStamp;

    }
}
