package fizzbuzzkataDovzenok;

public class fizzbuzzkata {
	
	private int[] numbers;

	public int[] getNumbers() {
		numbers = new int[100];
		for(int i = 0; i< numbers.length; i++) {
			numbers[i]=i+1;
		}
		return numbers;
	}
	
	public String fizbuzkat(int val) {
		if(val == 0){
			return Integer.toString(val);
		}else if (val % 3 == 0 && val % 5 == 0) {
			return "FizzBuzz";
		}else if (val % 3 == 0) {
			return "Fizz";
		}else if (val % 5 == 0) {
			return "Buzz";
		}
		return Integer.toString(val);
	}

}
