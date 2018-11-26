package com.client;


import com.client.model.decks.Deck;
import com.client.model.decks.WildDeck;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Starter extends AbstractJavaFxApplicationSupport {

    @Autowired
    private ConfigurationControllers.View view;

    protected ConfigurableApplicationContext context;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Fuck this shit");
        stage.setScene(new Scene(view.getView()));
        stage.setResizable(true);
        stage.centerOnScreen();
        stage.show();

    }

    public static void main(String[] args) {
        launchApp(Starter.class, args);
    }

}
