package com.common;

import com.common.model.Cards.CardTypes.WesterosEvents.*;
import com.common.model.Cards.CardTypes.Wilds.*;
import com.common.model.Decks.CommanderDeck;
import com.common.model.Decks.WesterosDeck;
import com.common.model.Decks.WildDeck;
import com.common.model.Map.Map;
import com.common.model.Orders.*;
import com.common.model.Units.Squad;
import com.common.model.Units.UnitTypes.Knight;
import com.common.model.Units.UnitTypes.Soldier;
import com.common.model.Units.UnitTypes.Vessel;
import com.common.model.utils.Auction;
import com.common.model.utils.ComparePlayerRaven;
import com.common.model.utils.ComparePlayersIron;
import com.common.model.utils.ComparePlayersSword;

import java.util.ArrayList;

public class Game extends Message {
    private Map map;
    private int moveNumber = 1;
    private int currentWildForce = 0;
    private static int numberOfPlayers = 0;
    private WildDeck wilds;
    private ArrayList<Order> orders;//a list of possible orders
    private WesterosDeck firstEventsDeck;
    private WesterosDeck secondEventsDeck;
    private WesterosDeck thirdEventsDeck;
    private ArrayList<Player> players = new ArrayList<Player>();
    private Player currentPlayer;
    private ArrayList<Player> ironThrone = new ArrayList<>();
    private ArrayList<Player> valyrianSword = new ArrayList<>();
    private ArrayList<Player> raven = new ArrayList<>();
    private Auction auction = null; //I really don't like it here...

    public Game(){
        orders=new ArrayList<>();
        orders.add(new OrderFire(true));
        orders.add(new OrderFire(false));
        orders.add(new OrderFire(false));
        orders.add(new OrderAttack(true,1));
        orders.add(new OrderAttack(false, -1));
        orders.add(new OrderAttack(false, 0));
        orders.add(new OrderHelp(true,1));
        orders.add(new OrderHelp(false,0));
        orders.add(new OrderHelp(false,0));
        orders.add(new OrderDefence(true, 2));
        orders.add(new OrderDefence(false, 1));
        orders.add(new OrderDefence(false, 1));
        orders.add(new OrderRule(true));
        orders.add(new OrderRule(false));
        orders.add(new OrderRule(false));

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

        firstEventsDeck = new WesterosDeck();
        secondEventsDeck = new WesterosDeck();
        thirdEventsDeck = new WesterosDeck();

        firstEventsDeck.add(new ArmyGathering());
        firstEventsDeck.add(new WinterIsClose());
        firstEventsDeck.add(new ThroneOfBlades());
        firstEventsDeck.add(new SupplyRecount());
        firstEventsDeck.add(new LastDaysOfSummer());
        firstEventsDeck.add(new ArmyGathering());
        firstEventsDeck.add(new WinterIsClose());
        firstEventsDeck.add(new ThroneOfBlades());
        firstEventsDeck.add(new SupplyRecount());
        firstEventsDeck.add(new LastDaysOfSummer());
        secondEventsDeck.add(new WinterIsClose());
        secondEventsDeck.add(new LastDaysOfSummer());
        secondEventsDeck.add(new GameOfThrones());
        secondEventsDeck.add(new BattleOfKings());
        secondEventsDeck.add(new BlackWingsBlackWords());
        secondEventsDeck.add(new WinterIsClose());
        secondEventsDeck.add(new LastDaysOfSummer());
        secondEventsDeck.add(new GameOfThrones());
        secondEventsDeck.add(new BattleOfKings());
        secondEventsDeck.add(new BlackWingsBlackWords());
        thirdEventsDeck.add(new InvasionOfWilds());
        thirdEventsDeck.add(new InvasionOfWilds());
        thirdEventsDeck.add(new InvasionOfWilds());
        thirdEventsDeck.add(new LoyalToTheSword());
        thirdEventsDeck.add(new LoyalToTheSword());
        thirdEventsDeck.add(new RainsOfTheAutumn());
        thirdEventsDeck.add(new StormOfSwords());
        thirdEventsDeck.add(new SeaOfStorms());
        thirdEventsDeck.add(new FeastForRavens());
        thirdEventsDeck.add(new WebOfLies());

        firstEventsDeck.shuffle();
        secondEventsDeck.shuffle();
        thirdEventsDeck.shuffle();
    }

    //should be called before getting an instance
    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers >= 0 && numberOfPlayers <= 6)//zero is for tests
        {
            this.numberOfPlayers = numberOfPlayers;

            this.map = new Map();
            addPlayers(numberOfPlayers);

            starRecount();
        }
        else
        {
            //throw new Exception("Number of players should be between 3 and 6");
        }

    }

    public void RecountSupply()
    {

    }

    public int getCurrentWildForce() {
        return currentWildForce;
    }

    public void setCurrentWildForce(short currentWildForce) {
        this.currentWildForce = currentWildForce;
    }

    public int getMoveNumber() {
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

        currentPlayer=Baratheon;//just because

        Squad squad;
        squad=new Squad(); squad.addUnit(new Soldier(Baratheon)); squad.addUnit(new Knight(Baratheon));
        map.getNodes().get(12).setSquad(squad);
        squad=new Squad(); squad.addUnit(new Soldier(Baratheon));
        map.getNodes().get(24).setSquad(squad);
        squad=new Squad(); squad.addUnit(new Vessel(Baratheon));
        map.getNodes().get(5).setSquad(squad);


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

        ironThrone.addAll(players);
        ironThrone.sort(new ComparePlayersIron());
        valyrianSword.addAll(players);
        valyrianSword.sort(new ComparePlayersSword());
        raven.addAll(players);
        raven.sort(new ComparePlayerRaven());
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

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getPlayer(int index){
        return players.get(index);
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {
        //here client should renew its game object and also render it to gui
    }

    @Override
    public void executeOnServer(Game game) {
        //server renews its game object and sends a new version to everybody
    }
}
