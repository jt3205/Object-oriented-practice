package method;

public class MethodEx4 {

	public static void main(String[] args) {
		int k = 95;
		int e = 85;
		int m = 73;

		System.out.println("총점 : " + total(k, e, m) + "");
		System.out.println("평균 : " + avg(k, e, m));
		System.out.println("학점 : " + grade(avg(k, e, m)));
		System.out.println("결과 : " + result(grade(avg(k, e, m))));
	}

	private static int total(int... arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

	private static double avg(int... arr) {
		double result = total(arr);
		result /= arr.length;
		return result;
	}

	private static String grade(double score) {
		String result = "";
		int score2 = (int) (score / 10);
		switch (score2) {
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
	
	private static String result(String grade) {
		return grade == "F" ? "불합격" : "합격";
	}
}
