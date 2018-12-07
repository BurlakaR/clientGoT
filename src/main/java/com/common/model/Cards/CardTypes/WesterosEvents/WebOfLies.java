package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.Message;
import com.common.SocketManagerCommon;
import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.Game;

public class WebOfLies extends WesterosEvent {
    public WebOfLies() {
        super("");
        message = "В фазе замыслов этого раунда игроки не могут отдавать приказы подмоги";
    }
    @Override
    public void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManagerCommon socketManager) {
        return null;
    }
}
