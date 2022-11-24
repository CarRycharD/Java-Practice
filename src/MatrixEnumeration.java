
public class MatrixEnumeration {

	public static void main(String[] args) {
		int[][] mtx = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx[i].length; j++) {
				System.out.print(mtx[i][j] + " ");
			}
		}

		System.out.println();
		
		for (int i = 0; i < mtx.length; i++) {
			for (int j = mtx[i].length - 1; j >= 0; j--) {
				System.out.print(mtx[i][j] + " ");

			}
		}
	}
}