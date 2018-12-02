package com.client.ui;

import com.common.model.Map.Map;
import com.common.model.Map.MapNodes.MapNode;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import javafx.scene.Group;
import javafx.scene.image.ImageView;


public class ViewMap {
    Group root;
    ImageBuilder imageBuilder;
    BiMap<MapNode, ViewNodeMap> nodeMap;
    BiMap<MapNode, ImageView> mapView;

    public ViewMap(ImageBuilder imageBuilder, Group root, Map map){
        this.imageBuilder=imageBuilder;
        this.root = root;

        nodeMap = HashBiMap.create();
        mapView = HashBiMap.create();
        for (MapNode node:
             map.getNodes()) {
            nodeMap.put(node, new ViewNodeMap(node, imageBuilder));
            ImageView buf = imageBuilder.createView(node);
            mapView.put(node, buf);
            root.getChildren().add(buf);
        }
    }

    public ImageView getNodeView(MapNode node){
        return mapView.get(node);
    }

    public MapNode getNodeOfView(ImageView imageView){
        return mapView.inverse().get(imageView);
    }

    public ImageView getNodeViewAt(int index){
        return (ImageView)mapView.values().toArray()[index];
    }

    public MapNode getNodeAt(int index){
        return (MapNode) mapView.inverse().values().toArray()[index];
    }
}
