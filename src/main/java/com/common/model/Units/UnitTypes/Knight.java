package com.common.model.Units.UnitTypes;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Player;
import com.common.model.Units.Unit;

public class Knight extends Unit {
    public Knight(Player player)
    {
        super(player, ("Knight"+player.getName()));
        cost = 2;
        damage = 2;
        damageToCastles = 2;
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
