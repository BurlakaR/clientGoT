package com.client.ui;

import com.common.model.utils.ForImage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageBuilder {
    static String folder ="img/";
    static String format =".png";

    public ImageView createView(ForImage forImage){
        String buf=folder+forImage.getImgName()+format;
        Image img;
        try {
            img = new Image(buf);
            ImageView image = new ImageView(img);
            image.setLayoutX(forImage.getX());
            image.setLayoutY(forImage.getY());
            image.setFitHeight(forImage.getH());
            image.setFitWidth(forImage.getW());
            return image;
        }catch(Exception e){
            System.out.println(buf);
        }
        return null;
    }


}
