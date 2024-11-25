package org.example.chatroom;

import org.example.chatroom.Service.MediatorLogic.ConcreteChatMediator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ConcreteChatMediator mediator = new ConcreteChatMediator();

        for (int i = 0; i < 3; i++) {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/chatroom/ChatClient.fxml"));
            stage.setScene(new Scene(loader.load()));

            ChatClientController controller = loader.getController();
            controller.initialize("User" + (i + 1), mediator);

            stage.setTitle("User" + (i + 1));
            stage.show();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
