package com.client;


import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
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

    /*
 _____________________________#####____
_________ Я знаю _____________#####____
___________что ты делал _______####______
_________прошлым летом!!________##________
_____________________________######_____
____________________________#######_____
____####__________________#########___
___######________________###_######___
#########_______________###__######__
_#######_______________###___######___
_______#################____######__
_______##########################__
________################____#####____
_________##___________##_____####______
_________##___________##_____#########___
_______###__________###______#########__ */
}
