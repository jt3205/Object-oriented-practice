package object;

public class ObjectEx4 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setName("바켱진");
		employee.setDept("홍보부");
		employee.setPay(3400000);
		employee.setScore(97.35);
		System.out.println("이름 : "+employee.getName());
		System.out.println("부서 : "+employee.getDept());
		System.out.println("급여 : "+employee.getPay());
		System.out.println("점수 : "+employee.getScore());
		
		employee.setEmployee("진달래", "경리부", 1200000, 75.34);
		System.out.println(employee.toString());
	}
}
