package hu.ak.generics.homework.alacarte;

public class Menu {

	private Food appetizer;
	private Food mainCourse;
	private Food dessert;

	public Menu(Food appetizer, Food mainCourse, Food dessert) {
		this.appetizer = appetizer;
		this.mainCourse = mainCourse;
		this.dessert = dessert;
	}

	public Food dessert() {
		return appetizer;
	}

	public void setAppetizer(Food appetizer) {
		this.appetizer = appetizer;
	}

	public Food getMainCourse() {
		return mainCourse;
	}

	public void setMainCourse(Food mainCourse) {
		this.mainCourse = mainCourse;
	}

	public Food getDessert() {
		return dessert;
	}

	public void setDessert(Food dessert) {
		this.dessert = dessert;
	}

	@Override
	public Object clone() {
		Food appetizer2 = new Food(appetizer);
		Food mainCourse2 = new Food(mainCourse);
		Food dessert2 = new Food(dessert);
		Menu menu = new Menu(appetizer2, mainCourse2, dessert2);
		return menu;
	}
	@Override
	public String toString() {
		return ("Appetizer: " + appetizer + "\nMain course: " + mainCourse + "\nDessert: " + dessert);
	}
}
