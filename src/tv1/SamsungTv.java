package tv1;

public class SamsungTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("»ï¼º Æ¼ºñ - Àü¿øÀ» ÄÒ´Ù");
	}

	@Override
	public void powerOff() {
		System.out.println("»ï¼º Æ¼ºñ - Àü¿øÀ» ²ö´Ù");
		
	}

	@Override
	public void soundUp() {
		System.out.println("»ï¼º Æ¼ºñ - º¼·ý¾÷");
		
	}

	@Override
	public void soundDown() {
		System.out.println("»ï¼º Æ¼ºñ - º¼·ý´Ù¿î");
		
	}

	
}
