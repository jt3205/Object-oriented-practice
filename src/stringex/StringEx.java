package stringex;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = s2;
		
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
	}

}
