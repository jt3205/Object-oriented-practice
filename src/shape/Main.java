package shape;

public class Main {

	public static void main(String[] args) {
		//동적바인딩(dynamic binding)---------------------------
				Shape sh=new Rectangle(4,5);
				System.out.println("사각형의 넓이 = " + sh.getSize());
				
				sh=new Triangle(3,7);
				System.out.println("삼각형의 넓이 = " + sh.getSize());
				
				//정적바인딩(static binding)----------------------------
				Rectangle rr=new Rectangle(4,5);
				System.out.println("사각형의 넓이 = " + rr.getSize()); //20
				
				Triangle tt=new Triangle(3,7);
				System.out.println("삼각형의 넓이 = " + tt.getSize()); //10.5
	}

}
