package hu.ak.generics.homework.productmodel;

public class Product {

	String name = "N/A";
	int price;
	
	{
		price = -1;
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
