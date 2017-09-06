package family;

public class Father extends Family  implements Job{
	
	public Father() {}
	public Father(String name) {
		super(name);
	}
	@Override
	public String work() {
		return "일";
	}
	@Override
	public String toString() {
		return super.toString() +"\n아빠는 "+work()+"를 한다";
	}
}
