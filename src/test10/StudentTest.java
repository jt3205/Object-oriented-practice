package test10;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student students[] = new Student[3];
		students[0] = new Student("민들래", 15, 170, 55);
		students[1] = new Student("진달래", 22, 165, 53);
		students[2] = new Student("개나리", 20, 155, 46);
		for (int i = 0; i < students.length; i++) {
			list.add(students[i]);
		}
		Student student = new Student("민들래", 15, 170, 55);
		
		StudentView view = new StudentView();
		System.out.println("이름\t나이\t신장\t몸무게");
		System.out.println("-----------------------------");
		view.viewStudent(student);
		System.out.println();
		view.viewStudents(list);
	}

}
