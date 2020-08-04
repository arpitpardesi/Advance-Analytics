import java.util.Scanner;

class Book{
	private int bookId;
	private String bookName;
	private int price;
	private String author;  
	
	public void setbID(int bookId) {
		this.bookId=bookId;
	}
	public void setBN(String bookName) {
		this.bookName=bookName;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void setAuth(String author) {
		this.author=author;
	}
	
	public int getID() {
        return bookId;
    }
	
	public String getName() {
        return bookName;
    }
	
	public int getPrice() {
        return price;
    }
	
	public String getAuth() {
        return author;
    }
	
	Book(){
		System.out.println("Default Constructor"); 
	}
	
	Book(int bookId, String bookName, int price, String author)
    { 
        this.bookName = bookName; 
        this.bookId = bookId; 
        this.price = price; 
        this.author = author; 
    } 
	
}

public class Test {
	public static void main(String args[]) {
		Book bk1 = new Book();
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter Book ID: ");  
		int a= sc.nextInt();  
		System.out.print("Enter Book Name: ");  
		String b= sc.nextLine();  
		System.out.print("Enter Author Name: ");  
		String d= sc.nextLine();
		System.out.print("Enter price ");  
		int c= sc.nextInt(); 
			
		Book bk2 = new Book(a,b,c,d);
		System.out.print("Book Name: "bk2.getName());
		System.out.print("Book ID: "bk2.getID());
		System.out.print("Price: "+bk2.getPrice());
		System.out.print("Author: "+bk2.getAuth());
		
		
	}

}
