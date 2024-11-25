package org.example.chatroom.Service.MediatorLogic;

import org.example.chatroom.Service.ClientLogic.ChatClient;

public interface ChatMediator {
    void sendMessage(String message, String sender, String recipient);
    void addClient(ChatClient client);
}
