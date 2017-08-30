package constructor;

public class ConstructorEx2 {
	public ConstructorEx2() {
		System.out.println("default Constructor");
	}
	
	public ConstructorEx2(String str) {
		this();
		System.out.println(str+" Constructor");
	}
	
	public ConstructorEx2(String str, int i) {
		this(str);
		System.out.println(str+" "+i+" Constructor");
	}
	
	public static void main(String[] args) {
		new ConstructorEx2("가나다", 10);
	}
}
