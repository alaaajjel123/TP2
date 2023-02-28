package functions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestIntegerFinderTest {

	@Test
	void test() {
		
		int [] t= {2,1,4};
		assertEquals(2, SmallestIntegerFinder.findSmallestInt(t));
		int [] t1= {4,1,10};
        assertEquals("dcba", SmallestIntegerFinder.findSmallestInt(t1));
        int [] t2= {1,14,18};
        assertEquals(1, SmallestIntegerFinder.findSmallestInt(t2));
	}

}
