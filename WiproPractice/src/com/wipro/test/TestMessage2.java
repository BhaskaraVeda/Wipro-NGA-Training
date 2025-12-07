package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Timeout;

public class TestMessage2   {
	Message obj=new Message("Testing framework");
String expmsg="Hi!Testing framework";


@Test   @Timeout(1000) // 1 sec
public void testSalMsg()
{
	assertEquals(expmsg, obj.salutationMessage());
}

}
