package test4;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public void setStudent(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal(int ... arr) {
		int result = 0;
		for (int i : arr) {
			result += i;
		}
		return result;
	}
	
	public double getAvg(int ... arr) {
		double result = getTotal(arr);
		return result / arr.length;
	}
	
	public String getGrade(double avg) {
		switch ((int)avg/10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	}
	
	public String getResult(String grade) {
		return grade == "F" ? "불합격" : "합격";
	}
	
	public String getView() {
		return "나의 이름은 "+name+"이고 총점은 "+getTotal(kor, eng, math)+"점이고 \n" + 
				"평균은 "+getAvg(kor, eng, math)+"이고 학점은 "+getGrade(getAvg(kor, eng, math))+"학점이며 \n" + 
				"결과는 "+getResult(getGrade(getAvg(kor,eng,math)))+"입니다";
	}
}
