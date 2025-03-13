
public class BooksInLibrary {

	public static void main(String[] args) {
		
		Books b1 = new Books("hades Of Grey" ,"Zade","123");
		Books b2 = new Books("Alchmaist" ,"abc","789");
		LibraryManagement l1 = new LibraryManagement("Cdac","BAngalore",3,b1);
		
		l1.addBook(b2);
		l1.addBook(b2);
		l1.addBook(b2);
		l1.addBook(b2);
		l1.displayBooks();
		l1.searchBook("Alchmcvvaist");
		
		
		
		
		
		

	}

}
