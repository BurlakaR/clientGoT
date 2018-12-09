package com.common.model.Units.UnitTypes;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Player;
import com.common.model.Units.Unit;

public class Soldier extends Unit {
    public Soldier(Player player)
    {
        super(player, ("Soldier"+player.getName()));
        cost = 1;
        damage = 1;
        damageToCastles = 1;
    }


    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
