package com.client.model;

import com.client.model.Decks.WesterosDeck;
import com.client.model.Decks.WildDeck;
import com.client.model.Cards.CardTypes.Wilds.*;

import java.util.ArrayList;

public class Game {
    private static Game INSTANCE;
    private Map map;
    private short moveNumber = 1;
    private short currentWildForce = 0;
    private short numberOfPlayers = 0;
    private WildDeck wilds;
    private WesterosDeck FirstEventsDeck;
    private WesterosDeck SecondEventsDeck;
    private WesterosDeck ThirdEventsDeck;
    private ArrayList<Player> players = new ArrayList<Player>();

    private Game(){
        wilds = new WildDeck();
        wilds.add(new GatheringAtMopokovodnaya())
                .add(new HordeAssault())
                .add(new KingBehindTheWall())
                .add(new MammothRiders())
                .add(new RavenKillers())
                .add(new RobbersOfRattlingShirt())
                .add(new SilenceAtTheWall())
                .add(new Vanguard())
                .add(new WerewolfScout()).shuffle();

        //FirstEventsDeck = new WesterosDeck();
        //SecondEventsDeck= new WesterosDeck();
        //SecondEventsDeck = new WesterosDeck();
        /*
        cards.add(new ArmyGathering());
        cards.add(new BattleOfKings());
        cards.add(new BlackWingsBlackWords());
        cards.add(new FeastForRavens());
        cards.add(new GameOfThrones());
        cards.add(new InvasionOfWilds());
        cards.add(new LastDaysOfSummer());
        cards.add(new LoyalToTheSword());
        cards.add(new RainsOfTheAutumn());
        cards.add(new SeaOfStorms());
        cards.add(new StormOfSwords());
        cards.add(new SupplyRecount());
        cards.add(new ThroneOfBlades());
        cards.add(new WebOfLies());
        cards.add(new WinterIsClose());*/
    }

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
