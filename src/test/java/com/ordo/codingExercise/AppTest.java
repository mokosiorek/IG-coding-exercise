package com.ordo.codingExercise;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	String testA = new String("darrow ou lykos");
    	String testAResult = new String("worrad uo sokyl");
    	
        assertTrue(testAResult.equals(WordReverser.reverseWords(testA)));
    }
    
    public void testAppBIsEmpty()
    {
    	String testB = new String("");
    	String testBResult = new String("");
    	
        assertTrue(testBResult.equals(WordReverser.reverseWords(testB)));
    }
    
    public void testAppCIsNull()
    {
    	String testC = null;
    	String testCResult = new String("String is null");
    	
        assertTrue(testCResult.equals(WordReverser.reverseWords(testC)));
    }
    
}
