package TestSuite_RunWith_Suite;

import org.junit.Test; 
import org.junit.Ignore; 

import TestTimeout.MessageUtil;
import static org.junit.Assert.assertEquals; 
public class TestJunit2 { 
	String message = "Robert"; 
	MessageUtil messageUtil = new MessageUtil(message); 
	
	@Test 
	public void testSalutationMessage() { 
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert"; 
		assertEquals(message,messageUtil.salutationMessage()); } 
	}