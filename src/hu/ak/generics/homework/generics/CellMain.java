package hu.ak.generics.homework.generics;

public class CellMain {

	public static void main(String[] args) {
		
	Cell<String> a = new Cell<String>();
	Cell<Number> b = new Cell<Number>();
	
	a.put("a");
	b.put(1);
	
	a.put("b");
	b.put(2);
	
	System.out.println(a.take());
	System.out.println(b.take());
	
	}
}
