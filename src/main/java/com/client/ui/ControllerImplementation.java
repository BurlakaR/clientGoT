package com.client.ui;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Map.Map;
import com.common.model.Map.MapNodes.MapNode;


public class ControllerImplementation implements ClientController {
    ModelViewBinding modelViewBinding = new ModelViewBinding();

    ControllerViewMap controllerViewMap= new ControllerViewMap(modelViewBinding);

    public ControllerImplementation(){

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

    }

    @Override
    public void render(Game game) {
        GameWindowController.setINSTANCE(game);
        modelViewBinding.rerender(GameWindowController.getGameInstance());
        controllerViewMap= new ControllerViewMap(modelViewBinding);
    }

    @Override
    public void render(Map map) {
        GameWindowController.getGameInstance().setMap(map);
        modelViewBinding.rerender(GameWindowController.getGameInstance());
        controllerViewMap= new ControllerViewMap(modelViewBinding);
    }
}
