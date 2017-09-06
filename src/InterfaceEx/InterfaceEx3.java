package InterfaceEx;

class User{
	private String name;
	
	public User() {
		super();
	}
	
	public User(String name) {
		this.name=name;
	}
	
	public String toString() {
		return "이름 : " + name +"\n";
	}
	
}

interface Score{
	
	public int sol = 20;		//배점
	
	public int getScore();	// 맞은수*sol
	
}

interface Print{
	public String toPaint();
}


public class InterfaceEx3 extends User implements Score,Print{
	int s;
	
	public InterfaceEx3(String name,int s) {
		super(name);
		this.s=s;
	}
	
	public static void main(String[] args) {
		InterfaceEx3 ob = new InterfaceEx3("홍길동",3);
		System.out.println(ob.toPaint());
	}

	@Override
	public String toPaint() {
		return super.toString()+"점수 : w"+getScore()+"점";
	}

	@Override
	public int getScore() {
		return s*sol;
	}
}
