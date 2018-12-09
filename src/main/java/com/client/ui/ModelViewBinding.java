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

    public void rerender(Game game){
        nodeCount=0;
        mapView = HashBiMap.create();
        GWC.getInstanceView().rerender();
        ImageView toSave=(ImageView) GWC.getInstanceView().getRoot().lookup("#save");
        GWC.getInstanceView().getRoot().getChildren().removeAll(GWC.getInstanceView().getRoot().getChildren());
        GWC.getInstanceView().getRoot().getChildren().add(toSave);
        for(int i = 0; i< GWC.getGameInstance().getMap().getNodes().size(); i++){
            createNode(GWC.getGameInstance().getMap().getNodes().get(i));
        }
        for(int i = 0; i< GWC.getInstanceView().getViewMap().size(); i++){
            ImageView buf = GWC.getInstanceView().getViewMap().getNodeView(i).getNodeImage();
            if(getNode(buf).isAble())buf.setEffect(Colors.getColor(getNode(buf).getOwner()));
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
