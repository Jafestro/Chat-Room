package org.example.chatroom.Service.MediatorLogic;

import java.util.HashMap;
import java.util.Map;

import org.example.chatroom.Service.ClientLogic.ChatClient;

public class ConcreteChatMediator implements ChatMediator {
    private Map<String, ChatClient> clients = new HashMap<>();

    @Override
    public void sendMessage(String message, String sender, String recipient) {
        ChatClient recipientClient = clients.get(recipient);
        if (recipientClient != null) {
            recipientClient.receiveMessage(sender, message);
        }
    }

    @Override
    public void addClient(ChatClient client) {
        clients.put(client.getUsername(), client);
    }
}
