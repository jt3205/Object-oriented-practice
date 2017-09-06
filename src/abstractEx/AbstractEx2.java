package abstractEx;

abstract class Shape{
	abstract public void onDraw();
	abstract public void onDel();
}

class Rectangle extends Shape {

	@Override
	public void onDraw() {
		System.out.println("사각형 그려부려!");
	}

	@Override
	public void onDel() {
		System.out.println("사각형 지우기!");
	}
	
}

class Circle extends Shape {

	@Override
	public void onDraw() {
		System.out.println("원 그려부러!");
	}

	@Override
	public void onDel() {
		System.out.println("원 지우기!");
	}
	
}

public class AbstractEx2 {
	public static void main(String[] args) {
		Shape shape = new Rectangle();
		test(shape);
		shape = new Circle();
		test(shape);
		
		Rectangle rectangle = new Rectangle();
		test(rectangle);
		Circle circle = new Circle();
		test(circle);
	}
	
	public static void test(Shape shape) {
		shape.onDraw();
		shape.onDel();
	}
}
