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
public class AI {
    
    // keep track of which card is selected
    int index = 0;
    
    
    private String AI_Name;
    private Deck deckOfCards = new Deck();
    private ArrayList<Card> AI_Deck = new ArrayList<Card>();
    
    
    AI(String name,int AI_number){   
        this.AI_Name = name;
        
        switch (AI_number) {
            case 1:  
                for(int i = 13; i < 26;i++){
                    AI_Deck.add(deckOfCards.getDeck().get(i));
                }
                break;
                
            case 2:  
                for(int i = 26; i < 39;i++){
                    AI_Deck.add(deckOfCards.getDeck().get(i));
                }
                break;
                
            case 3:  
                for(int i = 39; i < 52;i++){
                    AI_Deck.add(deckOfCards.getDeck().get(i));
                }
                break;
                
        } 
        
    }
    
    
    public ArrayList<Card> getAICards(){
        return AI_Deck;
    }
    
    public Card selectCard(int i){
        
        // if easy, select small values else select larger values
        
        return AI_Deck.get(i);
        
    }
    
}
