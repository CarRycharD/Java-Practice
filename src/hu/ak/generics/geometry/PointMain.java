package hu.ak.generics.geometry;

import java.util.Scanner;

public class PointMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please give the first number of the first coordinate");		
		int x1 = scanner.nextInt();
		System.out.println("Please give the second number of the first coordinate");
		int y1 = scanner.nextInt();
		
		Point point1 = new Point(x1, y1);
		
		System.out.println("Please give the first number of the second coordinate");
		int x2 = scanner.nextInt();
		System.out.println("Please give the second number of the second coordinate");
		int y2 = scanner.nextInt();
		
		Point point2 = new Point(x2, y2);
		
		double distance = Point.distance(point1, point2);
		
		if (point1.equals(point2)) {
			System.out.println("You have entered the same coordinate twice. There is no distance value. Shutting down.");
			System.exit(0);
		}
		
		System.out.println("\nFirst point:\nx1 = " + x1 + "\ny1 = " + y1 +"\nSecond point:\nx2 = " + 
				x2 + "\ny2 = " + y2 + "\n\n" + point1 + ": " + point1.hashCode() + "\n\n" + point2 + ": " + point2.hashCode()
				+ "\nDistance: " + distance);
	}
	
}
