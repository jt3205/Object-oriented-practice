package constructor;

public class ConstructorEx5 {
	public static void main(String[] args) {
		new Max(5,3).show();
	}
}
class Max{
	int a;
	int b;
	public Max(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void show() {
		System.out.println("Input a : "+a);
		System.out.println("Input b : "+b);
		System.out.println();
		System.out.println("큰수 : "+maxValue());
		System.out.println("작은수 : "+minValue());
	}
	
	public int maxValue() {
		return a > b ? a : b;
	}
	
	public int minValue() {
		return a < b ? a : b;
	}
}