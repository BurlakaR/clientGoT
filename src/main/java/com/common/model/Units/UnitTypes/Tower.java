package com.common.model.Units.UnitTypes;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Player;
import com.common.model.Units.Unit;

public class Tower extends Unit {
    public Tower(Player player)
    {
        super(player, ("Tower"+player.getName()));
        cost = 2;
        damage = 0;
        damageToCastles = 4;
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
