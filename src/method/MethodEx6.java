package method;

public class MethodEx6 {
	public static void view1() {
		System.out.println("static method");
	}
	public void view2() {
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		view1();
		
		new MethodEx6().view2();
	}
}