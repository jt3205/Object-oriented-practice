package constructor;

import java.util.Scanner;

public class ConstructorEx4 {
	int x;
	int y;
	
	public ConstructorEx4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로를 입력 : ");
		x = scanner.nextInt();
		System.out.print("세로를 입력 : ");
		y = scanner.nextInt();
	}
	
	private int calc(int x, int y) {
		return x * y;
	}
	
	public void display() {
		System.out.println("사각형의 넓이 : " + calc(x,y));
	}
	
	public static void main(String[] args) {
		ConstructorEx4 ob = new ConstructorEx4();
		ob.display();
	}
}
