package test;
import PremierExempleJUnit.src.main.java.functions.ArraysManager.java;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysManagerTest {

	@Test
	void testSum() {
	    int[] arr = {1, 2, 3, 4, 5};
	    int expectedSum = 55;
	    int actualSum = squareSum(arr);
	    assertEquals(expectedSum, actualSum);
	  }

}
