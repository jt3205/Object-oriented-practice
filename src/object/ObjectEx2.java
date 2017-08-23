package object;

public class ObjectEx2 {
	public static void main(String[] args) {
		User user = new User();
		user.setUser("박형진", 100, 80, 70);
		System.out.println(user.getUser());
	}
}
