package Test12;

public class Child extends Parent {
	int age;
	float tall;

	public Child(String name, int age, float tall) {
		super(name);
		this.age = age;
		this.tall = tall;
		printView2();
	}

	public void printView2() {
		printView();
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + tall);
	}
}
