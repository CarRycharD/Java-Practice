package hu.ak.generics.homework.colorcoder;

import java.util.Scanner;

public class ColorMain {

	public static void main(String[] args) {

		Color black = new Color();
		Color white = new Color(255, 255, 255);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please give me your color(RGB)");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.println("Red: " + a + "\nGreen: " + b + "\nBlue: " + c);

		Color userColor = new Color(a, b, c);
		System.out.println(userColor.toString() + " - " + userColor.getBrightness());
		while (userColor.getBrightness() > 10) {
			userColor.mix(black);
			System.out.println(userColor.toString() + " - " + userColor.getBrightness());
		}

		while (userColor.getBrightness() < 250) {
			userColor.mix(white);
			System.out.println(userColor.toString() + " - " + userColor.getBrightness());
		}

	}

}
