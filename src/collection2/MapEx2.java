package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx2 {
	public static void main(String[] args) {
		Book[] b = new Book[3];
		b[0] = new Book("java","kim",100);
		b[1] = new Book("c++","lee",250);
		b[2] = new Book("jsp","park",150);
		
		Map map = new HashMap();
		
		for(int i =0; i<b.length; i++)
			map.put(b[i].getTitle(), b[i]);
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("찾는 도서 명 : ");  String title = sc.next();
		
		if(map.get(title) == null)
			System.out.println("찾는 도서 없음");
		else {
			System.out.println("책이름 : "+map.get(title));
			System.out.println("책저자 : "+map.get(title));
			System.out.println("페이지 : "+map.get(title));
		}
		
		System.out.println(map);
	}

}
