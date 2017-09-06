package Test17;

public class Profile {
	private String name;
	private String phone;
	
	public Profile(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void printView() {
		System.out.println("이름 : "+name);
		System.out.println("연락처 : "+phone);
	}
}
