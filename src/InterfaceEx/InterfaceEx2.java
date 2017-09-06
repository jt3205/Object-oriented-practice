package InterfaceEx;

interface Cryable{
	public void cry();
}
interface Flyable{
	public void fly();
}
class Eagle implements Cryable,Flyable {

	@Override
	public void fly() {
			System.out.println("�������� ���� �ٴմϴ�");
	}

	@Override
	public void cry() {
			System.out.println("ļ��    ļ��~~");
		
	}

		
}
	




public class InterfaceEx2 {
	public static void main(String[] args) {
		Eagle ob = new Eagle();
		ob.fly();
		ob.cry();
	}
}



//abstract class Cryable{
//	abstract public void cry();
//}
//abstract class Flyable{
//	abstract public void fly();
//}
//class Eagle extends Flyable{
//
//	@Override
//	public void fly() {
//			System.out.println("�������� ���� �ٴմϴ�");		// 2
//			new CryableEx().cry();											// 3
//	}
//	
//	class CryableEx extends Cryable{
//
//		@Override
//		public void cry() {
//				System.out.println("ļ��  ļ��~~~");				// 4
//		}
//		
//	}
//	
//}
//
//
//
//public class InterfaceEx2 {
//	public static void main(String[] args) {
//			new Eagle().fly();			// 1
//	}
//}
