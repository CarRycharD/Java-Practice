package hu.ak.generics.homework.alacarte;

public class MenuMain {
	
	public static void main(String[] args) {
		
		Food chickensoup = new Food("Chicken Soup", 800);
		Food schnitzel = new Food("Schintzel", 1200);
		Food chocolatecake = new Food("Chocolate cake", 400);
		Menu menu = new Menu(chickensoup, schnitzel, chocolatecake);
		Menu menu2 = (Menu) menu.clone();
		
		System.out.println("Original menu:\n" +menu + "\n\nClone menu:\n" + menu2);
		
		chickensoup.setName("Mushroom Soup");
		
		System.out.println("\n---------\n");
		
		System.out.println("Original menu:\n" +menu + "\n\nClone menu:\n" + menu2);
		

	}
}
