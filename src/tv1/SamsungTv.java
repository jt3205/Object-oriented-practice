package tv1;

public class SamsungTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("�Ｚ Ƽ�� - ������ �Ҵ�");
	}

	@Override
	public void powerOff() {
		System.out.println("�Ｚ Ƽ�� - ������ ����");
		
	}

	@Override
	public void soundUp() {
		System.out.println("�Ｚ Ƽ�� - ������");
		
	}

	@Override
	public void soundDown() {
		System.out.println("�Ｚ Ƽ�� - �����ٿ�");
		
	}

	
}
