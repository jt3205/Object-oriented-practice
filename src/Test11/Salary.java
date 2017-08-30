package Test11;

public class Salary {
	private String name;
	private int salary;

	Salary(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	String getInfomation1() {
		return "이름 : " + name + "\n연봉 : " + salary;
	}
}
