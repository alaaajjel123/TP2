package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import functions.StringManager;

class StringManagerTest {

	@Test
	void test() {
		//arrange 
		String s= "alaa";
		//act 
		String r= StringManager.StringReverse(s);
		
		//assert
		assertEquals(r,"hello");
	}

}


