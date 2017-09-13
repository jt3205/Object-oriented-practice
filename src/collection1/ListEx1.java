package cllection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListEx1 {
	//  list  중복허용, 순서유지d
	@SuppressWarnings(value = "unchecked" )
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List list = new ArrayList();
			list.add("one");
			list.add(2);
			list.add(new Float(3.0f));
			list.add(4.0);
			list.add(2);
			list.add(new Integer(2));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         vcx                                               fddddddddddd
			list.add(new Double(4.00));
			System.out.println(list);
			
		Iterator iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}                

}
