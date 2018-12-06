package com.client.ui;

import com.common.model.Map.MapNodes.MapNode;
import com.common.model.Units.Unit;
import com.google.common.collect.BiMap;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class ViewNodeMap {
    ImageView nodeImage;
    Pane nodePane;

    public ViewNodeMap(ImageView nodeImage, Pane nodePane){
        this.nodeImage=nodeImage;
        this.nodePane=nodePane;
    }

    public ImageView getNodeImage() {
        return nodeImage;
    }

    public Pane getNodePane() {
        return nodePane;
    }
}
