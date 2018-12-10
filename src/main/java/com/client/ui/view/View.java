package com.client.ui.view;

import com.client.ui.Colors;
import com.client.ui.ControllerImplementation;
import com.client.ui.GWC;
import com.common.Player;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

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

    public void showNodes(){
        for(int i=0; i<viewMap.nodes.size(); i++){
            root.getChildren().add(viewMap.getNodeView(i).getNodeImage());
        }
    }

    public void showNodesInfo(){
        for(int i=0; i<viewMap.nodes.size(); i++){
            root.getChildren().add(viewMap.getNodeView(i).getNodePane().getOrder());
        }
    }

    public void setColorsToNodes(){
        for(int i = 0; i< GWC.getInstanceView().getViewMap().size(); i++){
            ImageView buf = getViewMap().getNodeView(i).getNodeImage();
            Player owner = ControllerImplementation.getModelViewBinding().getNode(buf).getOwner();
            if(owner!=null) {
                if (ControllerImplementation.getModelViewBinding().getNode(buf).isAble())
                    buf.setEffect(Colors.getColor(owner));
            }
            else buf.setEffect(new ColorAdjust());
        }
    }

    public void removeAllExceptNodes(){
        ArrayList<ImageView> allEN = new ArrayList<>();
        ObservableList<Node> buf=root.getChildren();
        for(int i=0; i<viewMap.nodes.size(); i++){
            if(buf.contains(viewMap.getNodeView(i).getNodePane().getOrder()))
            buf.remove(viewMap.getNodeView(i).getNodePane().getOrder());

            for (ImageView img:
                 viewMap.getNodeView(i).getNodePane().getUnits()) {
                if(buf.contains(img))
                    buf.remove(img);
            }
        }
    }
}
