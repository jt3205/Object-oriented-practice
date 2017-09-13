package Test21;

import java.util.HashMap;
import java.util.Map;

public class Test21 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("콩쥐팥쥐", 15000);
		map.put("백설공주", 10000);
		map.put("보물섬", 18000);

		System.out.println("콩쥐팥쥐의 책가격 = " + map.get("콩쥐팥쥐") + "원");
		System.out.println("보물섬의 책가격 = " + map.get("보물섬") + "원");
	}

}
