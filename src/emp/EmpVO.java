package emp;


//디폴트 생성자, 인자 3개 받는 생성자, getter&Setter
//VO (vlaue Object), Entity, DTO(Data Transfer Object), Bean
//:데이터를 하나로 묶어서 전송할 목적으로 만든 클래스 
public class EmpVO {
	private String ename;
	private String dept;
	private int salary;
	
	
	EmpVO(){
		
	}
	
	EmpVO(String ename, String dept, int salary){
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
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
