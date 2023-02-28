package functions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void test() {
		
		assertEquals(0, Triangle.type(0,-1,2));
		assertEquals(1, Triangle.type(2,2,2));
		assertEquals(2, Triangle.type(2,1,2));
		assertEquals(3, Triangle.type(2,1,3));
		
	}

}
