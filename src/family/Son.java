package family;

public class Son extends Family implements Job{
	
	public Son(String name) {
		super.name = name;
	}

	@Override
	public String work() {
		return "공부";
	}
	@Override
	public String toString() {
		return super.toString() +"\n아들은 "+work()+"를 한다";
	}
}
