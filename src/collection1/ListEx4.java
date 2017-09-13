package cllection1;

import java.util.ArrayList;
import java.util.List;

public class ListEx4 {

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
