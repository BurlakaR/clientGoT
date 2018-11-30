package com.client.ui;

import com.client.model.Map;
import com.client.model.Nodes.NodeMap;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;

public class GameController {

    HandlerBuilder hb;

    @FXML
    Group imageGroup;

    public void initialize(){
        hb= new HandlerBuilder();
        Map map=new Map((short)6);
        ArrayList<NodeMap> nodeArrayList = map.getNodes();
        for (NodeMap node:
                nodeArrayList) {
            ImageView buf=node.getImage();
            hb.ableChoose(buf);
            imageGroup.getChildren().add(buf);
        }

    }


}
