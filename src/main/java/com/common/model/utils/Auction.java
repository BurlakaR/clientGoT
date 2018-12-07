package com.common.model.utils;

import com.common.ClientController;
import com.common.Game;
import com.common.Message;
import com.common.Player;

import java.util.ArrayList;

public class Auction extends Message {
    private ArrayList<Player> players;

    public Auction(ArrayList<Player> players){
        this.players = players;
    }

    public Player getHighestStake(){
        return null;
    }

    public Player getLowestStake(){
        return null;
    }

    public ArrayList<Player> getEverybodyExceptHighestAndLowestStake(){
        return null;
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
        //multiple send of Stake objects. Then convert to Stake and get ints;
    }
}
