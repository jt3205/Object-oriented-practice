package Test11;

public class Test11 extends Salary {
	String department;
	
	Test11(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	String getInfomation2() {
		return super.getInfomation1()+"\n부서 : "+department;
	}
}
