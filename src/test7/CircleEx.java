package test7;

public class CircleEx {

	public static void main(String[] args) {
		Circle ob = new Circle(10);
		System.out.println("원의넓이 : " + ob.getSize());
	}

}

class Circle {
	int r;

	public Circle(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public double getSize() {
		return r * r * 3.14;
	}
}
