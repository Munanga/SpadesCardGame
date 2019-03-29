/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spadescardgame;
import java.util.ArrayList;
/**
 *
 * @author Munanga
 */
public class Player  {
    
    private String playerName;
    private Deck deckOfCards = new Deck();
    private ArrayList<Card> playerDeck = new ArrayList<Card>();
    

    Player(String name){
        this.playerName = name;
        
        for(int i = 0; i < 13;i++){
            playerDeck.add(deckOfCards.getDeck().get(i));
        }

    }
    
    
    public  ArrayList<Card> getPlayerCardDeck(){   
        return playerDeck;
    }
    
    
    
    
    
    
}
