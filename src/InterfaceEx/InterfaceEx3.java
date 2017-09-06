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
		return "�̸� : " + name +"\n";
	}
	
}

interface Score{
	
	public int sol = 20;		//����
	
	public int getScore();	// ������*sol
	
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
		InterfaceEx3 ob = new InterfaceEx3("ȫ�浿",3);
		System.out.println(ob.toPaint());
	}

	@Override
	public String toPaint() {
		return super.toString()+"���� : w"+getScore()+"��";
	}

	@Override
	public int getScore() {
		return s*sol;
	}
}
