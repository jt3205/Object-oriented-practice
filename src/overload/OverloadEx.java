package overload;

public class OverloadEx {
	int x = 17;
	int y = 15;
	
	public int max(){
		return (x>y)?x:y;
	}
	
	public int max(int x,int y){
		return (x>y)?x:y;
	}
	
	public float max(float x, float y) {
		return (x>y)?x:y;
	}
	
	public static void main(String[] args){
		OverloadEx ob = new OverloadEx();
		System.out.println("큰수:"+ob.max());
		System.out.println("큰수 : "+ob.max(75,100));
		System.out.println("큰수 : "+ob.max(90.5f,50.4f));
	}

	
}

/* Overload Method(중복함수) : 같은이름의 함수를 여러번 구현
 * 1. 반드시 함수이름이 동일
 * 2. 매개변수(인자)의 타입이 다르거나 갯수가 달라야 함
 * 이유 : 함수의 이름 절약
 */