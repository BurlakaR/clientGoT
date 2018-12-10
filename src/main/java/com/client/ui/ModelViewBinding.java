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
    }

    public void render(){
        nodeCount=0;
        mapView = HashBiMap.create();
        for(int i = 0; i< GWC.getGameInstance().getMap().getNodes().size(); i++){
            createNode(GWC.getGameInstance().getMap().getNodes().get(i));
        }
    }

    public void rerender(){
        for(int i = 0; i< GWC.getGameInstance().getMap().getNodes().size(); i++){
            updateNode(GWC.getGameInstance().getMap().getNodes().get(i));
        }
    }



    private void createNode(MapNode forImage){
        ImageView buf = GWC.getInstanceImgBuilder().createView(forImage);
        if(!forImage.isAble()){
            buf.setEffect(Colors.setBlack(new ColorAdjust()));
        }
        nodeCount++;
        mapView.put(forImage, buf);
        GWC.getInstanceView().getViewMap().addNodeView(buf, GWC.getInstanceImgBuilder().createNodePane(forImage));
    }

    public void updateNode(MapNode forImage){
        GWC.getInstanceView().getViewMap().getNodeView(ControllerImplementation.getModelViewBinding().getNodeView(forImage)).setNodePane(GWC.getInstanceImgBuilder().createNodePane(forImage));
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
