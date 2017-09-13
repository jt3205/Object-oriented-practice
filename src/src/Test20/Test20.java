package Test20;

public class Test20 {
	public static void main(String[] args) {
		String str = "10*20*30*40*50";

		String[] str2 = str.split("\\*");
		str = str.replace("*", "+");
		int sum = 0;
		for (int i = 0; i < str2.length; i++) {
			sum += Integer.parseInt(str2[i]);
		}
		System.out.println(str + " = " + sum);
	}

}
