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
public class PlayerTest {
    
    ArrayList<Card> deck = new ArrayList<Card>();
    
    
    public PlayerTest() {
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
     * Test of getPlayerCardDeck method, of class Player.
     */
    @Test
    public void testGetPlayerCardDeck() {
        
        
        
        
        ArrayList<Card> expResult = new ArrayList<>();
        for(int i = 0; i < 13; i++){
            expResult.add(deck.get(i));
        }
        
        Player instance = new Player("Frankerman",deck);
        
        ArrayList<Card> result = instance.getPlayerCardDeck();
        assertEquals(expResult, result);

    }

    /**
     * Test of updateRoundsWon method, of class Player.
     */
    @Test
    public void testUpdateRoundsWon() {
        int value = 1;
        Player instance = new Player("jimmy",deck);
        instance.updateRoundsWon(value);
        assertEquals(value, instance.getRoundsWon());

    }

    /**
     * Test of getRoundsWon method, of class Player.
     */
    @Test
    public void testGetRoundsWon() {
        Player instance = new Player("Lombe", deck);
        instance.updateRoundsWon(1);
        int expResult = 1;
        int result = instance.getRoundsWon();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of updateScore method, of class Player.
     */
    @Test
    public void testUpdateScore() {
        int value = 2;
        Player instance = new Player("Rick", deck);
        instance.updateScore(value);
        assertEquals(2, instance.getScore());
    }

    /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testGetScore() {
        Player instance = new Player("Jane", deck);
        instance.updateScore(2);
        int expResult = 2;
        int result = instance.getScore();
        assertEquals(expResult, result);

    }
    
    
}
