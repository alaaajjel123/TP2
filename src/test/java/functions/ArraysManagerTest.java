package functions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysManagerTest {

	@Test
	void test() {
		
	    int[] t = {1, 2, 3, 4, 5};
	    assertEquals(55, ArraysManager.squareSum(t));
	    int[] t1 = {10, 20, 30, 40, 50};
	    assertEquals(5500, ArraysManager.squareSum(t1));
	    int[] t2 = {100, 200, 300, 400, 500};
	    assertEquals(550000, ArraysManager.squareSum(t2));
	    
	  }

}
