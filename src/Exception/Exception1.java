package Exception;

//unchecked exception
public class Exception1 {
	public static void main(String[] args) {
		int var=5;
		
		try {
		int n = Integer.parseInt(args[0]);
		System.out.println(var/n);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ ����");
		}catch(NumberFormatException e) {
			System.out.println("���ڷ� �ٲܼ� ����");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�Էµ� ���� ����");
		}finally {
			System.out.println("������ �����");
		}
	}
}

