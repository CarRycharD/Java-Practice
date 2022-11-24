package hu.ak.generics.homework.productmodel;

public class ProductMain {

	public static void main(String[] args) {
		Product defaultProduct = new Product();
		Product definedProduct = new Product("Coffe", 800);
		
		System.out.println("Default product - Name: " + defaultProduct.getName() + " Price: " + defaultProduct.getPrice());
		System.out.println("Defined product - Name: " + definedProduct.getName() + " Price: " + definedProduct.getPrice());
	}
	
}
