package cllection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoNumber {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			set.add((int) (Math.random()*45)+1);
		}
		
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		
		for(int num : list)
			System.out.print(num + "\t");
	}

}
