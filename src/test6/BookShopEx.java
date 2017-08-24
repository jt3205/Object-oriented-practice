package test6;

public class BookShopEx {

	public static void main(String[] args) {
		BookShop book = new BookShop();
		book.setBook("자바완성","황완성",25000);
		book.viewBook();
		//viewBook()메서드를 이용해서 나머지 완성하시오
		System.out.println();
		
		book.setBook("JSP잡기");
		book.setAuthor("송JP");
		book.setPrice(3500);
		//getter를 이용해서 나머지 완성하시오
		System.out.println("제 목 : "+book.getBook()+"\n저 자 : "+book.getAuthor()+"\n가 격 : "+book.getPrice());
	}

}

class BookShop{
	String book;
	String author;
	int price;
	
	void setBook(String book, String author, int price) {
		setBook(book);
		setAuthor(author);
		setPrice(price);
	}
	
	void viewBook(){
		System.out.println("제 목 : "+getBook()+"\n저 자 : "+getAuthor()+"\n가 격 : "+getPrice());
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}