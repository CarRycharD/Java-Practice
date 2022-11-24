package hu.ak.generics.homework.trianglevalidation;

import java.util.Scanner;

public class TriangleValidator {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adja meg a háromszög A oldalát:");
		int a = scanner.nextInt();
		System.out.println("Adja meg a háromszög B oldalát:");
		int b = scanner.nextInt();
		System.out.println("Adja meg a háromszög C oldalát:");
		int c = scanner.nextInt();
		
		Triangle triangle = new Triangle(a, b, c);
		
		System.out.println("A oldal hossza: " + a);
		System.out.println("B oldal hossza: " + b);
		System.out.println("C oldal hossza: " + c);
		
		if(triangle.isValid(triangle)) {
			System.out.println("A megadott háromszög valid!");
		} else {
			System.out.println("A megadott háromszög invalid!");
		}
	}
	
}
