package hu.ak.generics.io;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ComplexNumber implements Serializable {

	private int real;
	private int imaginary;

	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	@Override
	public String toString() {
		return real + " + i" + imaginary;
	}

}
