package objectArray;

public class UserEx2 {

	public static void main(String[] args) {
		User user[] = new User[3];

		user[0] = new User("Kim","010-111-1111");
		user[1]= new User("Lee","010-222-2222");
		user[2] = new User("Park","010-333-3333");
	
		for (int i = 0; i < user.length; i++) {
			System.out.println(user[i].getName() +"\t"+user[i].getPhone());
		}
	}

}
