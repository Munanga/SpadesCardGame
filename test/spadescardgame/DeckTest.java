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
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDeck method, of class Deck.
     */
    @Test
    public void testGetDeck() {

        Deck instance = new Deck();
        ArrayList<Card> expResult = new ArrayList<>();
        ArrayList<Card> result = instance.getDeck();
        assertFalse("result is equal to null",result == null);

    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        Deck instance = new Deck();
        instance.shuffle();
        
        ArrayList<Card> a = instance.getDeck();
        ArrayList<Card> b = instance.getDeck();
        
        assertEquals(a, b);
        
    }


    
}
