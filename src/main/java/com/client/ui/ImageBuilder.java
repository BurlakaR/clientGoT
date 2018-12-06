package com.client.ui;

import com.common.model.Map.MapNodes.MapNode;
import com.common.model.Units.Unit;
import com.common.model.utils.ForImage;
import com.common.model.utils.ForNode;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class ImageBuilder {
    static String folder ="img/";
    static String format =".png";
    static int coordsSquad[][]={
            {86,0},{86,45},{48,0},{48,45}

    };

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

    public Pane createNodePane(MapNode forNode){
        Pane pane = new Pane();
        pane.setPrefHeight(90);
        pane.setPrefWidth(215);
        pane.setLayoutX(forNode.getXpane());
        pane.setLayoutY(forNode.getYpane());
        Group group = new Group();
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(90);
        rectangle.setWidth(215);
        rectangle.setFill(Paint.valueOf("1e90ff"));
        group.getChildren().add(rectangle);

        for(int i=0; i<forNode.getSquad().size();i++){
            ImageView warrior=createView(forNode.getSquad().get(i));
            warrior.setLayoutX(coordsSquad[i][0]);
            warrior.setLayoutY(coordsSquad[i][1]);
            group.getChildren().add(warrior);
        }
        group.getChildren().add(createView(forNode.getOrder()));
        group.getChildren().add(createView(forNode.getLogo()));
        pane.getChildren().add(group);
        return pane;
    }


}
