package Exception;

//unchecked exception
public class Exception1 {
	public static void main(String[] args) {
		int var=5;
		
		try {
		int n = Integer.parseInt(args[0]);
		System.out.println(var/n);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없음");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 바꿀수 없음");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력된 값이 없음");
		}finally {
			System.out.println("무적권 실행됨");
		}
	}
}

