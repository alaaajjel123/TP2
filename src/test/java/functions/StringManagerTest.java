package functions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import functions.StringManager;

class StringManagerTest {

	@Test
	void test() {
		
		String s= "alaa";
		assertEquals("aala", StringManager.StringReverse(s));
		String s1= "aymen";
		assertEquals("nemya", StringManager.StringReverse(s1));
		String s2= "malek";
		assertEquals("kelam", StringManager.StringReverse(s2));

	}

}


