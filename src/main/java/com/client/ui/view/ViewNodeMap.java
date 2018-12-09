package com.client.ui.view;

import javafx.scene.image.ImageView;

public class ViewNodeMap {
    ImageView nodeImage;
    ViewNodePane nodePane;

    public ViewNodeMap(ImageView nodeImage, ViewNodePane nodePane){
        this.nodeImage=nodeImage;
        this.nodePane=nodePane;
    }

    public ImageView getNodeImage() {
        return nodeImage;
    }

    public ViewNodePane getNodePane() {
        return nodePane;
    }

    public void setNodePane(ViewNodePane nodePane) {
        this.nodePane = nodePane;
    }

}
