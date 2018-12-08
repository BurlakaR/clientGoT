package com.client.ui;

import javafx.scene.Group;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;


public class ViewMap {
    Group root;
    ArrayList<ViewNodeMap> nodes;

    public ViewMap(Group root){
        this.root = root;

        nodes = new ArrayList<>();

    }


    public void addNodeView(ImageView nodeImage, ViewNodePane nodePane){
        nodes.add(new ViewNodeMap(nodeImage, nodePane));
        root.getChildren().add(nodeImage);
        root.getChildren().add(nodePane.getCoin());
    }

    public ViewNodeMap getNodeView(int i){
        return nodes.get(i);
    }

    public ViewNodeMap getNodeView(ImageView nodeImage){
        for (ViewNodeMap view:
             nodes) {
            if(view.getNodeImage().equals(nodeImage)){
                return view;
            }
        }
        return null;
    }

    public ViewNodeMap getNodeView(Pane nodePane){
        for (ViewNodeMap view:
                nodes) {
            if(view.getNodePane().equals(nodePane)){
                return view;
            }
        }
        return null;
    }

    public int size(){
        return nodes.size();
    }
}
