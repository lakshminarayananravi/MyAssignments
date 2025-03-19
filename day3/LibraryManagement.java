package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		Library bookRecords=new Library();
		
		String book = bookRecords.addBook("Rich dad poor dad");
		bookRecords.issueBook();
		System.out.println(book);
		
	}

}
