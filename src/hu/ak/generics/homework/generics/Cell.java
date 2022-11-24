package hu.ak.generics.homework.generics;

public class Cell<T> {

	public T thing;
	
	public  T take() {
		T a = thing;
		this.thing = null;
		return a;

		
	}
	
	public void put(T thing) {
		if (this.thing == null) {
			this.thing = thing;
		}
	}
	
}
