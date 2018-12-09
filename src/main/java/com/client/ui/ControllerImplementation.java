package com.client.ui;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Map.Map;
import com.common.model.Map.MapNodes.MapNode;


public class ControllerImplementation implements ClientController {
    ModelViewBinding modelViewBinding = new ModelViewBinding();

    ControllerViewMap controllerViewMap= new ControllerViewMap(modelViewBinding);

    public ControllerImplementation(){
        modelViewBinding.rerender(GWC.getGameInstance());
        controllerViewMap.ableAllNodes();
        controllerViewMap.changeToOrders();
    }

    @Override
    public void getCommander() {

    }

    @Override
    public void chooseSquadComposition(MapNode node) {

    }

    @Override
    public void getStake() {

    }

    @Override
    public void putOrders() {
        controllerViewMap.changeToOrders();
    }

    @Override
    public void render(Game game) {
        GWC.setINSTANCE(game);
        modelViewBinding.rerender(GWC.getGameInstance());
        controllerViewMap.ableAllNodes();
    }

    @Override
    public void render(Map map) {
        GWC.getGameInstance().setMap(map);
        modelViewBinding.rerender(GWC.getGameInstance());
        controllerViewMap.ableAllNodes();
    }
}
