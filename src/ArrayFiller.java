import java.util.Arrays;

public class ArrayFiller {

	public static void main(String[] args) {
		
		int[] case1 = (fillArray(2, 5));
		int[] case2 = (fillArray(3, 6));
		int[] case3 = (fillArray(4, 7));
		int[] case4 = (fillArray(5, 8));
		
		System.out.println(Arrays.toString(case1));
		System.out.println(Arrays.toString(case2));
		System.out.println(Arrays.toString(case3));
		System.out.println(Arrays.toString(case4));
		
	}
	static int[] fillArray(int size, int value) {
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			array[i] = value;
		}
		return array;
	}
}
