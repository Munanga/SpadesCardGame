/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spadescardgame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Munanga
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getImage method, of class Card.
     */
    @Test //pass
    public void testGetImage() {
        Card instance = new Card(0,4);
        String expImage = "6Spades.png";
        String result = instance.getImage();
        assertEquals(expImage, result);
        
    }

    /**
     * Test of setFaceValue method, of class Card.
     */
    @Test
    public void testSetFaceValue() {
        
        Card instance = new Card(0,0);
        int fv = 3;
        instance.setFaceValue(fv);        
        int expResult = instance.getFaceValue();
        int result = fv + 1;
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getFaceValue method, of class Card.
     */
    @Test
    public void testGetFaceValue() {        
        Card instance = new Card(0,5);
        int expResult = 6;
        int result = instance.getFaceValue();
        assertEquals(expResult,result);
        
    }

    /**
     * Test of setSuit method, of class Card.
     */
//    @Test
    public void testSetSuit() {//
        System.out.println("setSuit");
        int s = 0;
        Card instance = null;
        instance.setSuit(s);
        
    }

    /**
     * Test of getSuit method, of class Card.
     */
//    @Test
    public void testGetSuit() {
        Card instance = new Card(1,3);
        int expResult = 1;
        int result = instance.getSuit();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSuitString method, of class Card.
     */
//    @Test
    public void testGetSuitString() {
        Card instance = new Card(0,7);
        String expResult = "Spades";
        String result = instance.getSuitString();
        
        assertEquals(expResult,result);
        
    }

    /**
     * Test of getSuitNumberString method, of class Card.
     */
//    @Test
    public void testGetSuitNumberString() {//
        
        Card instance = new Card(0,5);
        String expResult = "7";
        String result = instance.getSuitNumberString();
        assertEquals(expResult, result);

        
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        Card instance = new Card(0,0);
        String expResult = "FaceValue: " + 2 + "\n"  +  "Suit: " + "Spades" + "\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
