package InterfaceEx;

//�������̽�----------------------------
interface Shape{
	int R=10;
	public void draw();
	public void erase();
	
}
class Circle implements Shape{

	
	
	@Override
	public void erase() {	
		System.out.println("���� �����");
	}

	@Override
	public void draw() {
		System.out.println("�������� " +R+ "�� ���� �׸���.");		
	}
}

public class InterfaceEx1 {
	public static void main(String[] args) {
		Circle ob = new Circle();
		ob.draw();
		ob.erase();
	}
}



//�߻�Ŭ����--------------------------------------------------
//abstract class Shape{
//	final int R=10;
//	abstract public void draw();
//	abstract public void erase();
//	
//}
//class Circle extends Shape{
//
//	
//	@Override
//	public void erase() {	
//		System.out.println("���� �����");
//	}
//
//	@Override
//	public void draw() {
//		System.out.println("�������� " +R+ "�� ���� �׸���.");		
//	}
//}
//
//public class InterfaceEx1 {
//	public static void main(String[] args) {
//		Circle ob = new Circle();
//		ob.draw();
//		ob.erase();
//	}
//}



//   //�Ϲ�Ŭ����-------------------------------
//class Shape{
//	final int R=10;
//	public void draw() {}
//	public void erase() {}
//	
//}
//class Circle extends Shape{
//	@Override
//	public void draw() {		// ������ ������
//		System.out.println("�������� " + R + "�� ���� �׸���");
//	}
//	
//	@Override
//	public void erase() {	
//		System.out.println("���� �����");
//	}
//}
//
//public class InterfaceEx1 {
//	public static void main(String[] args) {
//		Circle ob = new Circle();
//		ob.draw();
//		ob.erase();
//	}
//}