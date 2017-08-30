package constructor;

public class ConstructorEx6 {
	public static void main(String[] args) {
		Student st = new Student();
		st.setName("홍길동");
		st.setKor(99);
		st.setEng(35);
		st.setMath(77);
		System.out.println(st.toString());
		
		Student st2 = new Student("박형진",90,75,88);
		System.out.println("이름 : "+st2.getName());
		System.out.println("국어 : "+st2.getKor());
		System.out.println("수학 : "+st2.getMath());
		System.out.println("영어 : "+st2.getEng());
		System.out.println("총점 : "+st2.getTotal());
		System.out.println("평균 : "+st2.getAvg());
		System.out.println("학점 : "+st2.getGrade());
	}
}
