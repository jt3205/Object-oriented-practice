package tv1;

public class TvUser {
	public static void main(String[] args) {
		String com=args[0];
		Tv tv = null;
		
		if(com.equals("LG")) {
			tv = new LgTv();
		}else if(com.equals("SAMSUNG")) {
			tv = new SamsungTv();
		}else {
			System.out.println("error");
		}
		tv.powerOn();
		tv.powerOff();
		tv.soundUp();
		tv.soundDown();
	}
}



