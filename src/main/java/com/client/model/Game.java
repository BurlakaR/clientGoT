package com.client.model;

import java.util.ArrayList;

public class Game {
    private static Game INSTANCE;
    private Map map;
    private short moveNumber = 1;
    private short currentWildForce = 0;
    private short numberOfPlayers = 0;
    private ArrayList<Player> players = new ArrayList<Player>();


    //should be called before getting an instance
    public void setNumberOfPlayers(short numberOfPlayers) throws Exception {
        if(numberOfPlayers >= 3 && numberOfPlayers <= 6)
        {
            this.numberOfPlayers = numberOfPlayers;
            this.map = new Map(numberOfPlayers);
        }
        else
        {
            throw new Exception("Number of players should be between 3 and 6");
        }
    }

    public Game getInstance() throws Exception {
        if(numberOfPlayers != 0)
        {
            if(INSTANCE == null)
            {
                INSTANCE = new Game();
            }
            return INSTANCE;
        }
        else
        {
            throw new Exception("Instance is not configured with number of players");
        }
    }

    public void RecountSupply()
    {

    }

    public short getCurrentWildForce() {
        return currentWildForce;
    }

    public void setCurrentWildForce(short currentWildForce) {
        this.currentWildForce = currentWildForce;
    }

    public short getMoveNumber() {
        return moveNumber;
    }

    public void nextMove(short moveNumber) {
        if(moveNumber < 10)
        {
            this.moveNumber++;
        }
        else
        {
            GameOver();
        }
    }

    private void recountCastles()
    {

    }

    public void StartGame()
    {
        //create all players here
        //put proper units on the map nodes here
    }

    private void GameOver() {

    }
}
