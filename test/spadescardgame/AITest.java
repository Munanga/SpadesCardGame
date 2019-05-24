/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spadescardgame;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Munanga
 */
public class AITest {
    
    ArrayList<Card> deck = new ArrayList<Card>();
    
    public AITest() {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13;j++){
                Card card = new Card(i,j);
                deck.add(card);
            }
        }
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAICards method, of class AI.
     */
    @Test
    public void testGetAICards() {
        Deck d = new Deck();
        d.shuffle();
    
        AI instance = new AI("Jane",d.getDeck(),1);
        Integer expResult = 13;
        Integer result = instance.getAICards().size();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of selectCard method, of class AI.
     */
    @Test
    public void testSelectCard() {
               
        AI instance = new AI("Bob",deck, 1);       
        
        Card expResult = new Card(1,0);
        Card result = instance.selectCard(0);
        
        assertEquals(expResult.getSuit(),result.getSuit());
        assertEquals(expResult.getFaceValue(),result.getFaceValue());
    }

    /**
     * Test of updateRoundsWon method, of class AI.
     */
    @Test
    public void testUpdateRoundsWon() {
        int value = 1;
        AI instance = new AI("Jane",deck,1);
        instance.updateRoundsWon(value);
        assertEquals(value, instance.getRoundsWon());

    }

    /**
     * Test of getRoundsWon method, of class AI.
     */
    @Test
    public void testGetRoundsWon() {
        AI instance = new AI("Bob",deck,1);
        int expResult = 1;
        instance.updateRoundsWon(1);
        int result = instance.getRoundsWon();
        assertEquals(expResult, result);

    }

    /**
     * Test of updateScore method, of class AI.
     */
    @Test
    public void testUpdateScore() {
        int value = 2;
        AI instance = new AI("Bob",deck,1);
        instance.updateScore(value);
        instance.updateScore(value);
        assertEquals(4, instance.getScore());
    }

    /**
     * Test of getScore method, of class AI.
     */
    @Test
    public void testGetScore() {
        AI instance = new AI("Bob",deck,1);
        int expResult = 2;
        instance.updateScore(2);
        int result = instance.getScore();
        assertEquals(expResult, result);

    }
    
}
