package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Timeout;

public class TestMessage {
    Message obj=new Message("Testing framework");
	String expmsg="Testing framework";
	
	
	@Test   @Timeout(1000)
	public void testmsg()
	{
		assertEquals(expmsg, obj.getMsg());
	}
	
}
