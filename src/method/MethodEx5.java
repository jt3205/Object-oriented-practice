package method;

public class MethodEx5 {
	private static void view1(String str[]) {
		str[0] = "sudo";
	}
	public static void main(String[] args) {
		String str[] = {"hello"};
		view1(str);
		System.out.println(str[0]);
	}
}
