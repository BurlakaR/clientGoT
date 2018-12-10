package com.client.ui;

import com.common.Game;
import com.common.IClientController;
import com.common.model.Map.Map;
import com.common.model.Map.MapNodes.MapNode;


public class ControllerImplementation implements IClientController {
    static ModelViewBinding modelViewBinding = new ModelViewBinding();
    static ControllerViewMap controllerViewMap= new ControllerViewMap();

    public static ModelViewBinding getModelViewBinding() {
        return modelViewBinding;
    }

    public static ControllerViewMap getControllerViewMap() {
        return controllerViewMap;
    }

    public ControllerImplementation(){
        modelViewBinding.render();
        controllerViewMap.ableAllNodes();
        GWC.getInstanceView().setColorsToNodes();
        GWC.getInstanceView().showNodes();
        GWC.getInstanceView().showNodesInfo();
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
        GWC.getGameInstance().updateMapByMap(game.getMap());
        GWC.getInstanceView().removeAllExceptNodes();
        modelViewBinding.rerender();
        controllerViewMap.ableAllNodes();
        GWC.getInstanceView().setColorsToNodes();
        GWC.getInstanceView().showNodesInfo();
    }

    @Override
    public void render(Map map) {
        GWC.getGameInstance().updateMapByMap(map);
        GWC.getInstanceView().removeAllExceptNodes();
        modelViewBinding.rerender();
        controllerViewMap.ableAllNodes();
        GWC.getInstanceView().setColorsToNodes();
        GWC.getInstanceView().showNodesInfo();
    }
}