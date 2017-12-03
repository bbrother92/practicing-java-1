import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {
	@Test
	public void randomerTest() {
		assertTrue(Randomer.getSequence().contains("!"));// This is random sequence of "!" sign
	}
	
	@Test()
	public void backslashTest() {
		assertEquals(Backslash.shift(1), ']'); // Gives "]"
	}
	
	@Test
	public void enumTest() {
		String expectedResult = "0:ENGLISH language has 400 million speakersISO 639-1 code is en.\n" +
				"1:GERMAN language has 90 million speakersISO 639-1 code is de.\n" +
				"2:FRENCH language has 80 million speakersISO 639-1 code is fr.\n" +
				"3:RUSSIAN language has 150 million speakersISO 639-1 code is ru.\n";
		
		assertEquals(Enums.getSequence(), expectedResult);
	}
	
}