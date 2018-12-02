package com.client.ui;

import com.common.model.Nodes.NodeMap;
import com.common.model.Units.Unit;
import com.google.common.collect.BiMap;
import javafx.scene.image.ImageView;

public class ViewNodeMap {
    ImageBuilder imageBuilder;
    BiMap<Unit, ImageView> unitView;

    public ViewNodeMap(NodeMap node, ImageBuilder imageBuilder){
        this.imageBuilder=imageBuilder;
    }


}
