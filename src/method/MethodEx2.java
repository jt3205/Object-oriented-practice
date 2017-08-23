package method;

public class MethodEx2 {
	
	public static int view1() {
		return 10;
	}
	
	public static char view2() {
		return 'A';
	}
	
	public static float view3() {
		return 10.5f;
	}
	
	public static String view4() {
		return "korea";
	}

	public static boolean view5() {
		return true;
	}
	
	//call by name
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  = view1(); System.out.println(a);
		char b  = view2(); System.out.println(b);
		//float c  = view3(); System.out.println(c);
		System.out.println(view3());
		
		System.out.println(view4());
		System.out.println(view5());
	}


}
