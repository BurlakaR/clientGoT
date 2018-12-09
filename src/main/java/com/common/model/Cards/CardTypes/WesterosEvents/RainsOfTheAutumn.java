package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class RainsOfTheAutumn extends WesterosEvent {
    public RainsOfTheAutumn(){
        super("");
        message = "В фазе замыслов этого райнда игроки не могут отдавать особые приказы похода +1";
    }
    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
