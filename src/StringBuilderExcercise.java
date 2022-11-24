
public class StringBuilderExcercise {

	public static void main(String[] args) {
		StringBuilder sequence = new StringBuilder();
		
		for(int i = 0; i <10; i++) {
			if (i % 2 == 0) {
				sequence = sequence.append(i);
			} else {
				sequence = sequence.insert(0, i);
			}
		}
		
		System.out.println(sequence);
	}

}
