import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook a;
	@BeforeEach
	void setUp() throws Exception {
		a = new GradeBook(5);
		a.addScore(50);
		a.addScore(75);

		
	}

	@AfterEach
	void tearDown() throws Exception {
		a = null;
	}

	@Test
	void testAddScore() {
		
		assertEquals(2, a.getScoreSize(), .01);
		assertTrue(a.toString().equals("50.0 75.0 "));
	}

	@Test
	void testSum() {
		assertEquals(125, a.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50, a.minimum(), .0001);
	}

	@Test
	void testFinalScore() {
		assertEquals(75, a.finalScore(), .0001);
	}

}
