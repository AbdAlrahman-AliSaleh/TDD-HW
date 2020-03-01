package CalClassTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import CalClass.ClassC;

public class ClassT {
   
    
	@Test 
	public void testTwopositiveAdd()
	{
		
		double res=ClassC.addFunction(4.3,5.4);
	    assertTrue(res==9.7);
	}
	@Test 
	public void testTwoNegativeAdd()
	{
	
		double res=ClassC.addFunction(-1.3,-1.4);
		 assertTrue(res==-2.7);
	}
	@Test 
	public void testFirstPositiveSecondNegativeAdd()
	{
		
		double res=ClassC.addFunction(44.5,-10.1);
		 assertTrue(res==34.4);
	}
	@Test 
	public void testFirstNegativeAddSecondPositive()
	{
		
		double res=ClassC.addFunction(-17.2,12.1);
		 assertTrue(res==-5.1);
	}
	@Test 
	public void testTwoZeros()
	{
		double res=ClassC.addFunction(0,0);
		 assertTrue(res==0);
	}
	@Test 
	public void testFirstZeroSecondPositive()
	{
		
		double res=ClassC.addFunction(0,12.5);
		 assertTrue(res==12.5);
	}
	@Test 
	public void testFirstPositiveSecondZero()
	{
		
		double res=ClassC.addFunction(12.5,0);
		 assertTrue(res==12.5);
	}
	
	@Test 
	public void testFirstZeroSecondNegative()
	{
		
		double res=ClassC.addFunction(0,-12.5);
		 assertTrue(res==-12.5);
	}
	
	@Test 
	public void testFirstNegativeSecondZero()
	{
		
		double res=ClassC.addFunction(0,-12.5);
		 assertTrue(res==-12.5);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
