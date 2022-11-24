import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalCheckTest {

	@Test
	void testValueisStrictlyLargerthanStartingPointbutStrictlySmallerthanEndingPoint() {
		assertEquals(true, IntervalCheck.inRange(5, 10, 8));
	}

	@Test
	void testValueisStrictlyLargerthanEndingPoint() {
		assertEquals(false, IntervalCheck.inRange(5, 10, 11));
	}

	@Test
	void testValueisStrictlySmallerthanStarting() {
		assertEquals(false, IntervalCheck.inRange(5, 10, 4));
	}

	@Test
	void testValueEqualsStartingPoint() {
		assertEquals(true, IntervalCheck.inRange(5, 10, 5));
	}
	
	@Test
	void testValueEqualsEndingPoint() {
		assertEquals(true, IntervalCheck.inRange(5, 10, 10));
	}
	
	@Test
	void testValueEqualsStartingPointandEndingPoint() {
		assertEquals(true, IntervalCheck.inRange(5, 5, 5));
	}
	
	@Test
	void testStartingPointLargerthanEndingPoint() {
		assertEquals(false, IntervalCheck.inRange(10, 5, 5));
	}
}
