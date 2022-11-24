
public class Forandif {
	public static void main(String[] args) {
		
		for (int i = -10; i < 11; i++) {

			if (i % 10 <= 4) {

				System.out.println(i * i);

			}

			//else if (i % 2 == 0) {

				//System.out.println(i * -1);

			//}

			//else {
				//System.out.println(i);
			//}
		}

		// Bónusz feladat

		System.out.println("Bonus");

		for (int i = -10; i < 11; i++) {

			int a = 0;

			if (i <= 4) {

				i = i * i;

				if (i % 2 == 0) {

					a = i / 2;

				} else {

					a = i - 1 / 2;
				}

				System.out.println(i + " " + a);
				
				break;
			}

			else if (i % 2 == 0) {

				i = i * -1;
				
				a = i - 1 / 2;
				

				a = i - 1 % 2;
				}

				System.out.println(i + " " + a);
				break;
				

			}
		}

}


