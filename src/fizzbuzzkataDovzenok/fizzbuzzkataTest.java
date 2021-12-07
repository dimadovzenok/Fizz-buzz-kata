package fizzbuzzkataDovzenok;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class fizzbuzzkataTest {

	@BeforeEach
	public void setUp() throws Exception {
		fizzbuzzkata fizz = new fizzbuzzkata();
	}

	@Test
	public void Return100() {
		assertEquals(100, fizz.getNumbers().length);
	}

}
