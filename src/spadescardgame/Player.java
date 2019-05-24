/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spadescardgame;
import java.util.ArrayList;
/**
 * @author kyle Smith
 * @author Jack Munsaka
 */
public class Player  {
    
    private String playerName;
    private ArrayList<Card> playerDeck = new ArrayList<Card>();
    private int roundsWon;
    private int score;

    Player(String name, ArrayList<Card> deck){
        this.playerName = name;
        roundsWon = 0;
        score = 0;
        
        for(int i = 0; i < 13;i++){
            playerDeck.add(deck.get(i));
        }
        
    }
    
    
    public  ArrayList<Card> getPlayerCardDeck(){   
        return playerDeck;
    }
    
    // update player rounds won
    public void updateRoundsWon(int value){
       roundsWon = roundsWon + value;
    }
    
    // get rounds won
    public int getRoundsWon(){
       return roundsWon;
    }
    
    // update player score
    public void updateScore(int value){
       score = score + value;
    }
    
    // get player score
    public int getScore(){
       return score;
    }
    
    
    
}
