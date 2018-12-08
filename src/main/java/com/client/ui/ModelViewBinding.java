package com.client.ui;

import com.common.Game;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.utils.ForImage;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;

public class ModelViewBinding {
    BiMap<ForImage, ImageView> mapView;
    int nodeCount=0;

    public ModelViewBinding(){

        rerender(GameWindowController.getGameInstance());

    }

    public void rerender(Game game){
        nodeCount=0;
        mapView = HashBiMap.create();
        GameWindowController.getInstanceView().rerender();
        ImageView toSave=(ImageView) GameWindowController.getInstanceView().getRoot().lookup("#save");
        GameWindowController.getInstanceView().getRoot().getChildren().removeAll(GameWindowController.getInstanceView().getRoot().getChildren());
        GameWindowController.getInstanceView().getRoot().getChildren().add(toSave);
        for(int i=0; i<GameWindowController.getGameInstance().getMap().getNodes().size();i++){
            createNode(GameWindowController.getGameInstance().getMap().getNodes().get(i));
        }
    }

    private void createNode(MapNode forImage){
        ImageView buf = GameWindowController.getInstanceImgBuilder().createView(forImage);
        if(!forImage.isAble()){
            buf.setEffect(Colors.setBlack(new ColorAdjust()));
        }
        nodeCount++;
        mapView.put(forImage, buf);
        GameWindowController.getInstanceView().getViewMap().addNodeView(buf, GameWindowController.getInstanceImgBuilder().createNodePane(forImage));
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
