package fizzbuzzkataDovzenok;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzbuzzkataTest {

	@Test
	public void Return100() {
		fizzbuzzkata fizz = new fizzbuzzkata();
		assertEquals(100, fizz.getNumbers().length);
	}

}
