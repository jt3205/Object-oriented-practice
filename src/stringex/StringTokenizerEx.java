package stringex;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public StringTokenizerEx(String str, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "학교 , 집, 학원 ,, 게임방 ,노래방,도서관";
		String[] value = str.split(",");
		for(int i = 0; i<value.length; i++)
			System.out.println(value[i]);
		StringTokenizer token = new StringTokenizer(str, ",#$");
		System.out.println("파싱된 문자수 : "+token.countTokens());
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextElement());
		}
	}

}
