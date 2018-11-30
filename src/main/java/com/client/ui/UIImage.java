package com.client.ui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class UIImage {
    String imgString="img/";
    Image img;
    ImageView image;

    public UIImage(int x, int y, int w, int h, String imgThis){
        String buf=imgString+imgThis;
        try {
            img = new Image(buf);
        }catch(Exception e){
            System.out.println(buf);
        }
        image = new ImageView(img);
        image.setLayoutX(x);
        image.setLayoutY(y);
        image.setFitHeight(h);
        image.setFitWidth(w);
    }

    public ImageView getImage() {
        return image;
    }

    public void setXY(int x, int y){
        image.setLayoutX(x);
        image.setLayoutY(y);
    }
}
