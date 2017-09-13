package cllection1;

import java.util.ArrayList;
import java.util.List;

class Book{
		private String title;
		private String author;
		private int page;
		
		Book(){
			super();
		}
		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public int getPage() {
			return page;
		}

		public void setPage(int page) {
			this.page = page;
		}

		Book(String title, String author, int page){
			this.title= title;
			this.author = author;
			this.page = page;
		}
		
}
public class ListEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book ob = new Book("java","kim",100);
		Book ob2 = new Book("c++","lee",250);
		Book ob3 = new Book("jsp","park",300);
		
		List<Book> book = new ArrayList<>();
		
		book.add(ob);
		book.add(ob2);
		book.add(ob3);
		
		for(Book b : book)
			System.out.println("\n책이름 : "+ b.getTitle()
					+"\n책저자 : "+b.getAuthor()
					+"\n페이지 : "+b.getPage());
		
	}

}
