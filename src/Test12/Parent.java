package Test12;

public class Parent {
	String name;

	public Parent() {
		System.out.println("###인적사항###");
	}

	public Parent(String na) {
		this();
		this.name = na;
	}

	public void printView() {
		System.out.println("이름 : " + name);
	}
}
