package tv1;

public class LgTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("LgƼ�� - ������ �Ҵ�");
	}

	@Override
	public void powerOff() {
		System.out.println("LgƼ�� - ������ ����");
		
	}

	@Override
	public void soundUp() {
		System.out.println("LgƼ�� - ������");
		
	}

	@Override
	public void soundDown() {
		System.out.println("LgƼ�� - �����ٿ�");
		
	}

}
