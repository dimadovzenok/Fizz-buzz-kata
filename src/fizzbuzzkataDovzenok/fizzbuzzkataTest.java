package fizzbuzzkataDovzenok;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzbuzzkataTest {

	@Test
	public void Return100() {
		fizzbuzzkata fizz = new fizzbuzzkata();
		assertEquals(100, fizz.getNumbers().length);
	}
	
	@Test
	public void Return0() {
		fizzbuzzkata fizz = new fizzbuzzkata();
		assertEquals("0", fizz.fizbuzkat(0));
	}
	
	@Test
    public void FizzforMultipledThree(){
		fizzbuzzkata fizz = new fizzbuzzkata();
        assertEquals(fizz.fizbuzkat(3), ("Fizz"));
    }
	
	@Test
	public void sholdReturnBuzzFor5() {
		fizzbuzzkata fizz = new fizzbuzzkata();
		assertEquals(fizz.fizbuzkat(5), "Buzz");
	}
	
	@Test
	public void FizzBuzzFor15() {
		fizzbuzzkata fizz = new fizzbuzzkata();
		assertEquals(fizz.fizbuzkat(15), "FizzBuzz");
	}

}
