package ArthematicTwo.ArthematicTwo;

import static org.junit.Assert.assertNotEquals;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ArthematicTwoTest 
    extends TestCase
{
	 ArthematicTwo obj =new ArthematicTwo();
	    @org.junit.Test
	    public void testadd()
	    {
	    	int res=obj.Add(10, 5);
	    	int expected= 15;
	    	assertEquals(expected, res);
	    	
	    }
	    @org.junit.Test
	    public void testaddneg()
	    {
	    	int res=obj.Add(10, 5);
	    	int expected= 5;
	    	//assertEquals(expected, res);
	    	assertNotEquals(expected, res);
	    	
	    }
	    @org.junit.Test

	    public void testsub()
	    {
	    	int res=obj.Sub(10, 5);
	    	int expected= 5;
	    	assertEquals(expected, res);
	    	
	    }
	    @org.junit.Test

	    public void testmal()
	    {
	    	int res=obj.Mul(10, 5);
	    	int expected= 50;

	    	assertEquals(expected, res);
	    	
	    }
}
