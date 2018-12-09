package com.client.ui;

import com.client.ui.view.ViewNodePane;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.utils.ForImage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

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

    public ViewNodePane createNodePane(MapNode forNode){
        ViewNodePane pane = new ViewNodePane();
        ForImage buf = forNode.getOrder();
        buf.setX(86+forNode.getXpane());
        buf.setY(forNode.getYpane());
        pane.setOrder(createView(buf));

        ArrayList<ImageView> bufy = new ArrayList<>();
        for(int i=0; i<forNode.getSquad().size();i++){
            buf=forNode.getSquad().get(i);
            buf.setX(coordsSquad[i][0]+forNode.getXpane());
            buf.setY(coordsSquad[i][1]+forNode.getYpane());
            bufy.add(createView(buf));
        }
        pane.setUnits(bufy);
        return pane;
    }


}
