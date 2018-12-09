package com.client.ui.view;

import javafx.scene.Group;

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
