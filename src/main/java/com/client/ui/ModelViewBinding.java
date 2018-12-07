package com.client.ui;

import com.common.Game;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.utils.ForImage;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import javafx.scene.image.ImageView;

public class ModelViewBinding {
    BiMap<ForImage, ImageView> mapView;
    int nodeCount=0;

    Game game;
    View view;
    ImageBuilder imageBuilder;

    public ModelViewBinding(Game game, View view, ImageBuilder imageBuilder){
        mapView = HashBiMap.create();
        this.game=game;
        this.view=view;
        this.imageBuilder=imageBuilder;
        initializeNodes();
    }

    private void initializeNodes(){
        for(int i=0; i<game.getMap().getNodes().size();i++){
            createNode(game.getMap().getNodes().get(i));
        }
    }

    private void createNode(MapNode forImage){
        ImageView buf = imageBuilder.createView(forImage);
        nodeCount++;
        mapView.put(forImage, buf);
        view.getViewMap().addNodeView(buf, imageBuilder.createNodePane(forImage));
    }

    public ImageView getNodeView(MapNode mapNode){
        return mapView.get(mapNode);
    }

    public int getNodeCount(){
        return nodeCount;
    }

    public MapNode getNode(ImageView view){
        return (MapNode) mapView.inverse().get(view);
    }
}
