package Test17;

public class Test17 extends Profile implements Score, Display {
	int score;
	
	public Test17(String name, String phone) {
		super(name, phone);
	}

	public static void main(String[] args) {
		Test17 test = new Test17("박형진", "010-7205-3242");
		test.printView();
		test.scoreResult(5);
		test.display();
	}

	@Override
	public void display() {
		System.out.println("점수 : "+score);
	}

	@Override
	public void scoreResult(int sol) {
		score = sol * nu;
	}
	
}
