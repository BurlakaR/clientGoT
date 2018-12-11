package com.common.model.Orders;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Units.Squad;

import java.util.ArrayList;

public class OrderRule extends Order {
    private ArrayList<Squad> squadsBuilt = new ArrayList<Squad>();
    public OrderRule(boolean star) {
        super("OrderRule", star,0);
        orderType = OrderType.OrderRule;
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {
        controller.configureRuleOrder(this);
    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }

    public void addBuiltSquad(Squad squad){
        squadsBuilt.add(squad);
    }

    public ArrayList<Squad> getSquadsBuilt() {
        return squadsBuilt;
    }
}
