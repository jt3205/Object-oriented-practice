package shape;

public class Rectangle extends Shape {
	
	public Rectangle() {
		
	}
	
	public Rectangle(int data1, int data2) {
		super.data1 = data1;
		super.data2 = data2;
	}
	
	@Override
	public double getSize() {
		return getData1() * getData2();
	}

}
