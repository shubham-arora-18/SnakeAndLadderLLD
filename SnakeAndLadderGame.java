import java.util.HashMap;
import java.util.Optional;


/* 
Game
    Players
    Board
    Dice
    SnakeAndLadders
    RunningOrEnded
 
 Player
    id
    name

 Dice
    maxNumber
  
 SnakeAndLadder
    startpoint
    endpoint
        
      
 */
/*

 */

interface Move{
    public int move(int start,int end);
}

class SnakeMove implements Move{
    public int move(int start,int end){
        return end;
    }

}

class LadderMove implements Move{
    public int move(int start,int end){
        return end;
    }

}

class BearMove implements Move{
    public int move(int start,int end){
        return (start+end);
    }

}

class Character{
    int startPoint;
    int endpoint;

    Move moveObject;

    public Character(int startPoint, int endpoint, Move moveObject) {
        this.startPoint = startPoint;
        this.endpoint = endpoint;
        this.moveObject = moveObject;
    }

    public int move(){
        return moveObject.move(startPoint,endpoint);
    }

}

abstract class Dice{
    int maxNumber;

    protected Dice(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    abstract public int getNumberFromDice();
}
class NormalDice extends Dice{

    static NormalDice normalDice;

    static NormalDice getNormalDice(){
        //if (normalDice.maxNumber)
    }

    public NormalDice(int maxNumber) {
        super(maxNumber);
    }

    @Override
    public int getNumberFromDice() {
        //random
        return 0;
    }
}

class BiasedDice extends Dice{

    public BiasedDice(int maxNumber) {
        super(maxNumber);
    }

    @Override
    public int getNumberFromDice() {
        //biased
        return 0;
    }
}

class Player{

}

class Game{
    final HashMap<Integer,Character> characterMap;
    final HashMap<Player,Integer> playerLocation;
    Dice dice;
    final Integer winnerPlayer;

    public Game(HashMap<Integer, Character> characterMap, HashMap<Player, Integer> playerLocation, Integer winningInteger) {
        this.characterMap = characterMap;
        this.playerLocation = playerLocation;
        this.winnerPlayer = winningInteger;
    }

    public boolean validMove(Player p, Integer diceValue){
        //
    }

    public int move(Player p, Integer diceValue){

        //you got current location
        //added diceValue to curr loc
        //doesCharacterExistAtThisPosition -> {get new location from character.move, update in player hashmap and return}
        //update new location in player hashmap and return
        //return newLocation;
    }

    public Optional<Character> doesCharacterExistAtThisPosition(){

    }

    public int rollDice(){
        return dice.getNumberFromDice();
    }

    public boolean setDie(Dice d){
        this.dice = d;
        return true;
    }
}

/*
Users
userId |

Game
GameId | Winner(PlayerId)

GameDiceTable


GamePlayerTable
id| Gameid | Player

GameMoveTable
id| GameId | moveCount | playerId | startPos | endPos

GameCharacterTable
id| gameId | characterType| characterStartPoint | characterEndPoint

*/