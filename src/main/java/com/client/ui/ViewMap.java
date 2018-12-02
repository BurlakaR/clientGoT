package com.client.ui;

import com.common.model.Map;
import com.common.model.Nodes.NodeMap;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import javafx.scene.Group;
import javafx.scene.image.ImageView;

import java.util.Set;


public class ViewMap {
    Group root;
    ImageBuilder imageBuilder;
    BiMap<NodeMap, ViewNodeMap> nodeMap;
    BiMap<NodeMap, ImageView> mapView;

    public ViewMap(ImageBuilder imageBuilder, Group root, Map map){
        this.imageBuilder=imageBuilder;
        this.root = root;

        nodeMap = HashBiMap.create();
        mapView = HashBiMap.create();
        for (NodeMap node:
             map.getNodes()) {
            nodeMap.put(node, new ViewNodeMap(node, imageBuilder));
            ImageView buf = imageBuilder.createView(node);
            mapView.put(node, buf);
            root.getChildren().add(buf);
        }
    }

    public ImageView getNodeView(NodeMap node){
        return mapView.get(node);
    }

    public NodeMap getNodeOfView(ImageView imageView){
        return mapView.inverse().get(imageView);
    }

    public ImageView getNodeViewAt(int index){
        return (ImageView)mapView.values().toArray()[index];
    }

    public NodeMap getNodeAt(int index){
        return (NodeMap) mapView.inverse().values().toArray()[index];
    }
}
