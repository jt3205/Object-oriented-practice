package test1;

public class Emp {
	private String name;
	private int age;
	private double tall;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public void setEmp(String name, int age, double tall) {
		setName(name);
		setAge(age);
		setTall(tall);
	}

	public void viewEmp() {
		System.out.println("나의 이름은 " + getName() + "이며, " + getAge() + "살이고 키는 " + getTall() + "cm입니다");

	}
}
