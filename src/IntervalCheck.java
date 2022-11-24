
public class IntervalCheck {

	public static void main(String[] args) {
		
		System.out.println(inRange(5, 10, 7));
		
	}
		
		static boolean inRange(int leftEnd, int rightEnd, int value) {
			if(leftEnd <= value && value <= rightEnd) {
				return true;
			} else if(leftEnd > rightEnd) {
				System.out.println("Empty intervall");
				return false;
			}
			return false;
		
		
	}
	
}
