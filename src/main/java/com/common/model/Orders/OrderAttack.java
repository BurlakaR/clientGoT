package com.common.model.Orders;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Units.Squad;
import com.common.model.utils.Battle;

public class OrderAttack extends Order {
    private boolean leavePowerCoinOnPreviousNode;
    private Squad squad;

    public OrderAttack(boolean star, int power) {
        super("OrderAttack", star, power);
        if(power<0) this.setImgName(this.getImgName()+"1");
        else if(power==0) this.setImgName(this.getImgName()+"2");
        orderType = OrderType.OrderAttack;
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {
        controller.configureAttackOrder(this);
    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
        if(target.isFreeOrOwnedBy(source.getOwner())){
            target.setSquad(source.takeSquad());
        }
        else {
            Battle battle = new Battle();
            battle.executeOnServer(game, socketManager);
        }
        game.updateNodeByNode(target);
        source.setOrder(new NoOrder());
        game.updateNodeByNode(source);
    }

    public boolean isLeavePowerCoinOnPreviousNode() {
        return leavePowerCoinOnPreviousNode;
    }

    public void setLeavePowerCoinOnPreviousNode(boolean leavePowerCoinOnPreviousNode) {
        this.leavePowerCoinOnPreviousNode = leavePowerCoinOnPreviousNode;
    }

    public Squad getSquad() {
        return squad;
    }

    public void setSquad(Squad squad) {
        this.squad = squad;
    }
}
