package tv1;

public class LgTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("Lg티비 - 전원을 켠다");
	}

	@Override
	public void powerOff() {
		System.out.println("Lg티비 - 전원을 끈다");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Lg티비 - 볼륨업");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Lg티비 - 볼륨다운");
		
	}

}
