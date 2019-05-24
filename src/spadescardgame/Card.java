/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spadescardgame;

/**
 *
 * @author jmm186
 */
public class Card {
      
     private int faceValue;
    private int suit;
    
    private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    private String[] cardValue = {"2", "3", "4", "5",
                                   "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    
    private String[] cardValueHard = {"2", "3", "4", "5",
                                   "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace","ljoker","bjoker"};
    Card(int s, int fv){
        this.suit = s;
        this.faceValue = fv;
    }
    
        
    public String getImage(){
        String imageName = cardValue[faceValue] + cardSuit[suit] + ".png";
        return imageName;                  
    } 

    public void setFaceValue(int fv){
        this.faceValue = fv;
    }
    
    public int getFaceValue(){
        return faceValue + 1;
    }
    
    public void setSuit(int s){
        this.suit = s;
    }
    
    public int getSuit(){
        return suit;
    }
    
    public String getSuitString(){
        return cardSuit[suit];
    }
    
    public String getSuitNumberString(){
        return cardValue[faceValue];
    }
    
    public String toString(){
        return "FaceValue: " + cardValue[faceValue] + "\n"  +  "Suit: " + cardSuit[suit] + "\n";
        
    }
    
}
