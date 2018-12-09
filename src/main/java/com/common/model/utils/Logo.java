package com.common.model.utils;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Player;

public class Logo extends ForImage {
    Player player;
    public Logo(int w, int h, Player player) {
        super(0, 0, w, h, ("Logo"+player.getName()));
        this.player=player;
    }

    public Player getPlayer(){
        return player;
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
