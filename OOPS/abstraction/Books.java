
public class Books {

	String title ;
	String author;
	String isbn ;
	
	public Books(String title, String author, String isbn) {
		
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		
	}
	void displayBook() {
		System.out.println("title  :"+title);
		System.out.println("author :"+author);
		System.out.println("isbn :"+isbn);
	
		
	}
	
}
