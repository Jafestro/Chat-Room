package org.example.chatroom;

import org.example.chatroom.Service.ClientLogic.ChatClient;
import org.example.chatroom.Service.MediatorLogic.ChatMediator;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatClientController {
    @FXML private TextArea messageArea;
    @FXML private TextField recipientField;
    @FXML private TextField messageField;

    private ChatClient chatClient;

    public void initialize(String username, ChatMediator mediator) {
        chatClient = new ChatClient(username, mediator, messageArea);
    }

    @FXML
    private void handleSend() {
        String recipient = recipientField.getText();
        String message = messageField.getText();
        if (!recipient.isEmpty() && !message.isEmpty()) {
            chatClient.sendMessage(message, recipient);
            messageField.clear();
        }
    }
}