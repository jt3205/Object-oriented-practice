package cllection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListEx2 {
	@SuppressWarnings(value = "unchecked" )
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Object> set = new ArrayList<>();
			set.add("봄");
			set.add("여름");
			set.add(new Integer(10));
			set.add("가을");
			set.add(4.0);
			set.add("겨울");
			set.add(10.f);
			System.out.println(set);
			
			for(Object o : set) {
				System.out.println(o);
			}
	}          

}
