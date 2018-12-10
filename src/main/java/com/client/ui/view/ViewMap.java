package com.client.ui.view;

import javafx.scene.Group;
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

    public ViewNodeMap getNodeViewByOrder(ImageView order){
        for (ViewNodeMap view:
                nodes) {
            if(view.getNodePane().getOrder().equals(order)){
                return view;
            }
        }
        return null;
    }

    public int size(){
        return nodes.size();
    }
}
