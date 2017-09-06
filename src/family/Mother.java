package family;

public class Mother extends Family implements Job {
	
	public Mother() {
		
	}
	
	public Mother(String name) {
		super.name = name;
	}

	@Override
	public String work() {
		return "집안일";
	}
	
	@Override
	public String toString() {
		return super.toString() +"\n엄마는 "+work()+"를 한다";
	}
}
