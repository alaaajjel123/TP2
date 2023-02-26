package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class typeTest {

	@Test
	void test() {
		assertEquals(0, type(0,0,0));
		assertEquals(0, type(2,3,5));
		assertEquals(1, type(1,1,1));
		assertEquals(2, type(4,4,5));
		assertEquals(3, type(3,4,5));
	}

}
