package cllection1;

import java.util.HashSet;
import java.util.Set;

public class SetEx { //     Set 중복허용 ㅡ 순서유
	@SuppressWarnings(value = "unchecked" )
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set set = new HashSet();
			set.add("one");
			set.add(2);
			set.add(new Float(3.0f));
			set.add(4.0);
			set.add(2);
			set.add(new Integer(2));
			set.add(new Double(4.00));
			System.out.println(set);
	}                

}
