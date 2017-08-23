package test2;

public class Triangle {
	private double base;
	private double height;
	
	public void setData(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getSize() {
		return base * height / 2;
	}
	
	public String getView() {
		return "삼각형의 넓이 : "+getSize();
	}
}
