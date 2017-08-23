package test4;

public class StudentEx {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudent("박형진", 90, 58, 85);
		System.out.println(student.getView());
	}
}
