package StaticEx;

class Test {
	int x;
	int y;
	static int z;

	static {
		System.out.println("static �ʱ�ȭ ����");
	}

	public Test(int x, int y, int z1) {
		this.x = x;
		this.y = y;
		z = z1;
		System.out.println("��ü �ʱ�ȭ ����");
	}

	public void view() {
		System.out.println(x + " " + y + " " + z);
	}

}

public class StaticEx1 {
	public static void main(String[] args) {
		Test ob1 = new Test(1, 2, 3);
		Test ob2 = new Test(5, 6, 7);
		ob1.view();
		ob2.view();

	}
}
