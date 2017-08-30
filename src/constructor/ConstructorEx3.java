package constructor;

public class ConstructorEx3 {
	public static void main(String[] args) {
		UserInfo user = new UserInfo("도라에몽","성남시 분당구 양영디지털고등학교");
		System.out.println("이름 : "+user.getName());
		System.out.println("주소 : "+user.getAddr());
	}
}

class UserInfo {
	private String name;
	private String addr;
	
	public UserInfo() {
		System.out.println("** 주소록 **");
	}
	public UserInfo(String name, String addr) {
		this();
		this.name = name;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
}