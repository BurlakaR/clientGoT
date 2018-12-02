package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.model.Game;

public class GameOfThrones extends WesterosEvent {
    public GameOfThrones(){
        message = "Каждый Дом в порядке хода берёт из резерва власти один жетон " +
                "за каждый знак короны  вподвластных ему землях. " +
                "Также Дом берёт жетон власти за каждый свой порт с кораблём, если в смежном море нет врага.";
        img = "";
    }


    @Override
    public void triggerCard(Game game) {

    }
}
