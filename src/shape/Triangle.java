package shape;

public class Triangle extends Shape{
	public Triangle() {
		
	}
	
	public Triangle(int data1, int data2) {
		super.data1 = data1;
		super.data2 = data2;
	}
	
	@Override
	public double getSize() {
		return getData1() * getData2() / 2;
	}
}
