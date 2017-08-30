package constructor;

public class Student {
	private String name;
	private int kor;
	private int math;
	private int eng;

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public Student() {
		
	}

	public Student(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public int getTotal() {
		return kor + math + eng;
	}

	public double getAvg() {
		return (double) getTotal() / 3;
	}
	
	public String getGrade() {
		switch ((int) getAvg()/10) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "홍길동의 점수는 "+getTotal()+" 이며, 평균은 "+getAvg()+"이고 학점은 "+getGrade()+"입니다.";
	}
}
