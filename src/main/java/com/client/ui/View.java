package com.client.ui;

import com.common.Game;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class View {
    Group root;
    ViewMap viewMap;



    public View(Group root){
        this.root=root;
        viewMap=new ViewMap(root);
    }


    public ViewMap getViewMap() {
        return viewMap;
    }

    public void rerender(){
        viewMap=new ViewMap(root);
    }

    public Group getRoot() {
        return root;
    }

}
