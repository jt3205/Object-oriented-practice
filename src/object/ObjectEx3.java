package object;

public class ObjectEx3 {
	public static void main(String[] args) {
		Member member = new Member();
		member.setName("박형진");
		member.setAge(17);
		member.setTall(175.5);
		
		System.out.println("이름 : "+member.getName());
		System.out.println("나이 : "+member.getAge()+"세");
		System.out.println("신장 : "+member.getTall()+"cm");
	}
}
