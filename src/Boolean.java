
public class Boolean {

	public static void main(String[] args) {

		boolean equalsTrue = 5 == 5;
		boolean equalsFalse = 5 == 4;
		boolean lessthanTrue = 5 < 6;
		boolean lessthanFalse = 5 < 4;
		boolean greaterthanTrue = 5 > 4;
		boolean greaterthanFalse = 5 > 6;
		boolean lessthanorequalTrue = 5 <= 5;
		boolean lessthanorequalFalse = 5 <= 4;
		boolean greaterthanorequals1True = 5 >= 5;
		boolean greaterthanorequals2True = 5 >= 4;
		boolean greaterthanorequalsFalse = 5 >= 6;
		boolean notequalTrue = 5 != 4;
		boolean notequalFalse = 5 != 5;
		boolean andTrue = true || true;
		boolean andFalse = true || false;
		boolean orTrue = true || false;
		boolean orFalse = false || false;
		boolean notTrue = !false;
		boolean notFalse = !true;
		System.out.println("equalsTrue = " + equalsTrue);
		System.out.println("equalsFalse = " + equalsFalse);
		System.out.println("lessthanTrue = " + lessthanTrue);
		System.out.println("lessthanFalse = " + lessthanFalse);
		System.out.println("greaterthanTrue = " + greaterthanTrue);
		System.out.println("greaterthanFalse = " + greaterthanFalse);
		System.out.println("lessthanorequalTrue = " + lessthanorequalTrue);
		System.out.println("lessthanorequalFalse = " + lessthanorequalFalse);
		System.out.println("greaterthanorequals1True = " + greaterthanorequals1True);
		System.out.println("greaterthanorequals2True = " + greaterthanorequals2True);
		System.out.println("greaterthanorequalsFalse = " + greaterthanorequalsFalse);
		System.out.println("notequalTrue = " + notequalTrue);
		System.out.println("notequalFalse = " + notequalFalse);
		System.out.println("andTrue = " + andTrue);
		System.out.println("andFalse = " + andFalse);
		System.out.println("orTrue = " + orTrue);
		System.out.println("orFalse = " + orFalse);
		System.out.println("notTrue = " + notTrue);
		System.out.println("notFalse = " + notFalse);

		// Bónusz feladat

		boolean divisbleTrue1 = (5 % 5) == 0;
		boolean divisbleTrue2 = (6 % 6) == 0;
		boolean divisbleFalse1 = (5 % 4) == 0;
		boolean divisbleFalse2 = (6 % 5) == 0;
		System.out.println("divisbleTrue1 = " + divisbleTrue1);
		System.out.println("divisbleTrue2 = " + divisbleTrue2);
		System.out.println("divisbleFalse1 = " + divisbleFalse1);
		System.out.println("divisbleFalse2 = " + divisbleFalse2);

	}

}
