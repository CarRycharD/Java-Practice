
public class BookDemo {

	public static void main(String[] args) {
		Book book_1 = new Book("Clean Code", "Robert C. Martin", "2008");
		Book book_2 = new Book("Refactroing", "Martin Fowler", "1999");
		
		System.out.println(book_1.getDetailedName());
		System.out.println(book_2.getDetailedName());
	}
	
}