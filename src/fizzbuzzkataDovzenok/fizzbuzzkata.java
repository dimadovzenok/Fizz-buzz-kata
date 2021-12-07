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
		}
		return Integer.toString(val);
	}

}
