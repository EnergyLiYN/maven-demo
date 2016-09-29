package edu.zju.cst.myproject.model;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void testSayHello(){
	User user = new User();
	String expected = "Hello world";;
	String actual = user.sayHello("world");
	assertEquals(expected, actual);
	}
}
