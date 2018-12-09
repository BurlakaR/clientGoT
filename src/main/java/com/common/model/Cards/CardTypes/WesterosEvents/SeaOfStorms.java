package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class SeaOfStorms extends WesterosEvent {
    public SeaOfStorms(){
        super("");
        message = "В фазе замыслов этого раунда игроки не могут отдавать приказы набега";
    }
    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
