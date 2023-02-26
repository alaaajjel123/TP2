package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestIntegerFinderTest {

	@Test
	void test() {
		assertEquals("cba", SmallestIntegerFinder("abc"));
        assertEquals("dcba", SmallestIntegerFinder("abcd"));
        assertEquals("hanoi", SmallestIntegerFinder("hanoi"));
	}

}
