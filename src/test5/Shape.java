package test5;

public class Shape {
	public Shape(int x) {
		System.out.println("원의 넓이는 "+x*x*3.14+"입니다.");
	}
	public Shape(int x, int y) {
		System.out.println("사각형의 넓이는 "+x*y+"입니다.");
	}
	public Shape(int t, int b, int h) {
		System.out.println("사다리꼴의 넓이는 "+(double)(t+b)*h/2+"입니다.");
	}
	
}
