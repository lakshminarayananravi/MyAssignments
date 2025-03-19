package week1.day3;

public class Library {

	public String addBook(String bookName) {
		System.out.println("Book added Successfully");
		return bookName;

		
		
		
	}
	
	
	
	public void issueBook() {
		System.out.println("Book issued Successfully");
	}
	
	public static void main(String[] args) {
		
		Library bookOptions=new Library();
		
		String book = bookOptions.addBook("Rich Dad Poor Dad");
		bookOptions.issueBook();
		System.out.println(book);

	}

}
