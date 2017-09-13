package test;

public class UserProc {
	
	User user;
	public User getLoginUser(String id, String pw) {
		if(id.equals("pororo") || pw.equals("1234"))
			return user = new User(id, pw, "뽀로로" , 89.97);
		return null;
	}

}
