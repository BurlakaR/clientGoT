package com.common.model;

import com.common.Message;
import com.common.model.Cards.CardTypes.Wilds.*;
import com.common.model.Decks.CommanderDeck;
import com.common.model.Decks.WesterosDeck;
import com.common.model.Decks.WildDeck;
import com.common.model.Orders.*;
import com.common.model.utils.ComparePlayerRaven;
import com.common.model.utils.ComparePlayersIron;
import com.common.model.utils.ComparePlayersSword;

import java.util.ArrayList;

public class Game extends Message {
    private static Game INSTANCE;
    private Map map;
    private short moveNumber = 1;
    private short currentWildForce = 0;
    private short numberOfPlayers = 0;
    private WildDeck wilds;
    private ArrayList<Order> orders;
    private WesterosDeck FirstEventsDeck;
    private WesterosDeck SecondEventsDeck;
    private WesterosDeck ThirdEventsDeck;
    private ArrayList<Player> players = new ArrayList<Player>();
    private ArrayList<Player> ironThrone = new ArrayList<>();
    private ArrayList<Player> valyrianSword = new ArrayList<>();
    private ArrayList<Player> raven = new ArrayList<>();

    public Game(){
        orders=new ArrayList<>();
        orders.add(new OrderFire(true));
        orders.add(new OrderFire(false));orders.add(new OrderFire(false));
        orders.add(new OrderAtack(true,1));
        orders.add(new OrderAtack(false, -1)); orders.add(new OrderAtack(false, 0));
        orders.add(new OrderHelp(true,1));
        orders.add(new OrderHelp(false,0)); orders.add(new OrderHelp(false,0));
        orders.add(new OrderDefence(true, 2));
        orders.add(new OrderDefence(false, 1)); orders.add(new OrderDefence(false, 1));
        orders.add(new OrderRule(true));
        orders.add(new OrderRule(false));orders.add(new OrderRule(false));

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
    public void setNumberOfPlayers(short numberOfPlayers) {
        if(numberOfPlayers >= 0 && numberOfPlayers <= 6)//zero is for tests
        {
            this.numberOfPlayers = numberOfPlayers;
            this.map = new Map(numberOfPlayers);

            addPlayers(numberOfPlayers);
            starRecount();
        }
        else
        {
            //throw new Exception("Number of players should be between 3 and 6");
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

    public void setMap(Map map) {
        this.map = map;
    }

    public Map getMap(){
        return map;
    }

    public ArrayList<Order> getOrders(){
        return orders;
    }

    private void addPlayers(int playernumber){
        Player Stark = new Player("Stark", 1, 2, 3, 4, 2, new CommanderDeck());
        Player Lannister = new Player("Lannister", 2, 1, 2, 6, 1, new CommanderDeck());
        Player Baratheon = new Player("Baratheon", 2, 1, 1, 5, 4, new CommanderDeck());

        players.add(Stark);
        players.add(Lannister);
        players.add(Baratheon);
        if(numberOfPlayers>3){
            Player Greyjoy = new Player("Greyjoy", 2, 1, 5, 1, 6, new CommanderDeck());
            players.add(Greyjoy);
            if(numberOfPlayers>4){
                Player Tyrell = new Player("Tyrell", 2, 1, 6, 2, 5, new CommanderDeck());
                players.add(Tyrell);
                if(numberOfPlayers>5){
                    Player Martell = new Player("Martell", 2, 1, 4, 3, 3, new CommanderDeck());
                    players.add(Martell);
                }
            }
        }



        players.sort(new ComparePlayersIron());
        ironThrone.addAll(players);
        players.sort(new ComparePlayersSword());
        valyrianSword.addAll(players);
        players.sort(new ComparePlayerRaven());
        raven.addAll(players);

        ArrayList<Player> buf = new ArrayList<>();
        int randindex;
        while(!players.isEmpty()){
            randindex=(int) (Math.random() * players.size());
            buf.add(players.get(randindex));
            players.remove(randindex);
        }
        players=buf;
    }

    public void starRecount(){
        short i=3;
        for (Player p:
             raven) {
            p.setStarNumber(i);
            if (i>0) i--;
        }
        if(numberOfPlayers>4){
            for(int j=1; j<4; j++){
                raven.get(j).setStarNumber((short) (raven.get(j).getStarNumber()+1));
            }
        }
    }
}
