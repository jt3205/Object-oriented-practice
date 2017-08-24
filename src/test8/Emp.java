package test8;

public class Emp {
	String name;
	String dept;
	int salary;
	@Override
	public String toString() {
		return "이름 : " + getName()+"\n부서 : " + getDept()+"\n급여 : " + getSalary() + "원";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
