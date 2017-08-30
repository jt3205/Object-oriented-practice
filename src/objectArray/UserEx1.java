package objectArray;

public class UserEx1 {
	public static void main(String[] args) {
		User user1 = new User("Kim","010-111-1111");
		User user2= new User("Lee","010-222-2222");
		User user3 = new User("Park","010-333-3333");
		
		System.out.println(user1.getName() +"\t"+user1.getPhone());
		System.out.println(user2.getName() +"\t"+user2.getPhone());
		System.out.println(user3.getName() +"\t"+user3.getPhone());
		
		
	}
}
