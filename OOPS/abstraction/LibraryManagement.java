import java.util.ArrayList;

public class LibraryManagement {
	String name ;
	String address ;
	Books bk;
	Books[] b;
	 int bookCount;
	
	
	public LibraryManagement(String name, String address, int capacity,Books bk) {
		
		this.name = name;
		this.address = address;
		this.bk = bk;
		this.b = new Books[capacity];
	    this.bookCount = 0;
	} 
	
	public void addBook(Books book) {
		if(bookCount < b.length) {
			b[bookCount]= book;
			bookCount++;
		} else {
            System.out.println("Library is at full capacity.");
        }
		
	}
	public void displayBooks(){
		for(int i=0; i<bookCount; i++) {
			b[i].displayBook();
		}
		
		
		
		
	}
	public void searchBook(String title){
		boolean ifFound=false;
		for(int i=0; i<bookCount; i++) {
			if(b[i].title ==title){
				ifFound=true;
				System.out.println("Found");
				break;
				
			}
			
			}
		if(!ifFound) System.out.println("Book Not Found");
	
		
		
	}

}
