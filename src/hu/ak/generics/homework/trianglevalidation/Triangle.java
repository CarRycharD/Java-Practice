package hu.ak.generics.homework.trianglevalidation;

public class Triangle {

	protected int a;
	protected int b;
	protected int c;
	
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isValid(Triangle triangle) {
		
		return a + b > c && a + c > b && b + c > a;

		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
}
