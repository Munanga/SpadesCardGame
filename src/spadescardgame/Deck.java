/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spadescardgame;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author jmm186
 */
public class Deck {
    
    
    private ArrayList<Card> deckOfCards = new ArrayList<Card>();
    
    // constructor
    public Deck(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13;j++){
                Card card = new Card(i,j);
                deckOfCards.add(card);
            }
        }               
    }
    
    
    public ArrayList<Card> getDeck(){
        return deckOfCards;
    }
    
    
    public void shuffle(){
        Collections.shuffle(deckOfCards); 
    }
        
    
    public void printAllCards(){
        for(Card c: deckOfCards){
            System.out.println(c.toString()); 
        }
        
    }
    
    
}
