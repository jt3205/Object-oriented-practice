package test10;

import java.util.List;

public class StudentView {
	public void viewStudent(Student student) {
		System.out.println(student.getName()+"\t"+student.getAge()+"\t"+student.getHeight()+"\t"+student.getWeight());
	}
	public void viewStudents(List<Student> list) {
		for (Student student : list) {
			viewStudent(student);
		}
	}
}
