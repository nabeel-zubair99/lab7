/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuf39838
 */
public class JavaApplication7Test  {
    
    public JavaApplication7Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of currentPlayer method, of class JavaApplication7.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("* currentPlayer: testscalarMultiapplication");
        JavaApplication7 instance = new JavaApplication7();
        instance.currentPlayer();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals("X",instance);
         assertEquals("O",instance);
    }

    /**
     * Test of changePlayer method, of class JavaApplication7.
     */
    @Test
    public void testChangePlayer() {
        System.out.println("changePlayer");
        JavaApplication7 instance = new JavaApplication7();
//        instance.changePlayer();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals("player1",instance);
        assertEquals("player2",instance);
    }

    /**
     * Test of makeMove method, of class JavaApplication7.
     */
    @Test
    public void testMakeMove() {
        System.out.println("makeMove");
        JavaApplication7 instance = new JavaApplication7();
//        instance.makeMove();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals("O",instance);
        assertEquals("X",instance);
    }
@Test
public void createboard(){
     System.out.println("makeMove");
        JavaApplication7 instance = new JavaApplication7();
//        instance.makeMove();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals("O",instance);
        assertEquals("X",instance);
}
    /**
     * Test of SpaceInUse method, of class JavaApplication7.
     */
    @Test
    public void testSpaceInUse() {
        System.out.println("SpaceInUse");
        JavaApplication7 instance = new JavaApplication7();
//        instance.SpaceInUse();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals("space in the unoccupied",instance);
    }

    /**
     * Test of main method, of class JavaApplication7.
     */
    @Test
    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        JavaApplication7.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
