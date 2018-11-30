package com.client.ui;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;



public class HandlerBuilder {
    EventHandler nodeEnter, nodeExit;


    ColorAdjust bright, usual;


    public HandlerBuilder(){
        bright = new ColorAdjust(); usual= new ColorAdjust();
        nodeEnter=new EventHandler() {
            @Override
            public void handle(Event event) {
                bright.setBrightness(0.3);
                ((ImageView)event.getSource()).setEffect(bright);
            }
        };

        nodeExit=new EventHandler() {
            @Override
            public void handle(Event event) {
                usual.setBrightness(0.0);
                ((ImageView)event.getSource()).setEffect(usual);
            }
        };

    }

    public void ableChoose(ImageView img){
        img.setOnMouseEntered(nodeEnter);
        img.addEventFilter(MouseEvent.MOUSE_ENTERED, nodeEnter);
        img.setOnMouseExited(nodeExit);
        img.addEventFilter(MouseEvent.MOUSE_EXITED, nodeExit);
    }

    public void removeAbleChoose(ImageView img){
        img.removeEventHandler(MouseEvent.MOUSE_ENTERED, nodeEnter);
        img.removeEventHandler(MouseEvent.MOUSE_EXITED, nodeEnter);
    }

}
