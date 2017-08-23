package test3;

public class LoginEx {
	public static void main(String[] args) {
		Login login = new Login();
		login.setLogin("OrOl", "qwerty1234");
		login.viewLogin();
	}
}

class Login {
	private String id;
	private String password;
	
	public void setLogin(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public void viewLogin() {
		System.out.println("아이디는 "+id+"이고 비밀번호는 "+password+"입니다.");
	}
}