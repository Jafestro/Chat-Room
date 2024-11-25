package org.example.chatroom.Service.ClientLogic;

import org.example.chatroom.Service.MediatorLogic.ChatMediator;

import javafx.scene.control.TextArea;

public class ChatClient {
    private String username;
    private ChatMediator mediator;
    private TextArea messageArea;

    public ChatClient(String username, ChatMediator mediator, TextArea messageArea) {
        this.username = username;
        this.mediator = mediator;
        this.messageArea = messageArea;
        mediator.addClient(this);
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(String message, String recipient) {
        mediator.sendMessage(message, username, recipient);
    }

    public void receiveMessage(String sender, String message) {
        messageArea.appendText(sender + ": " + message + "\n");
    }
}

