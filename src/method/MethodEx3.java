package method;

public class MethodEx3 {
	
	//call by value : ���� �����ϴ� ���
	
	public static void show1(int a, char b, double c, float d) {
		System.out.println(a+","+b+","+c+","+d);
	}

	public static int show2(int i, int j, int k) {
		return i+j+k;
	}
	
	public static float show3(int i, int j, int k) {
		return (float)(i+j+k)/3;
	}

	public static String show4(int i, int j, int k) {
		float result = (float)(i+j+k)/3;
		if(result>=60) return "�հ�";
		else return "���հ�";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show1(10,'A',10.5,100.3f);
		
		System.out.println("�հ�:"+show2(95,85,73));
		
		System.out.println("���: "+show3(95,85,73));
		
		System.out.println("���: "+show4(95,85,73));
		
	}

}