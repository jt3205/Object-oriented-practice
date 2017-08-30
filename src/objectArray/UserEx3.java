package objectArray;

public class UserEx3 {
	public static void main(String[] args) {
		User user[] = new User[]{new User("Kim","010-111-1111"), new User("Lee","010-222-2222"), new User("Park","010-333-3333")};
		
		for (User user2 : user) {
			System.out.println(user2.getName()+"\t"+user2.getPhone());
		}
	}
}
