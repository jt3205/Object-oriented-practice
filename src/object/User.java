package object;

public class User {
	private String name;
	private int k;
	private int e;
	private int m;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public void setUser(String name, int k, int e, int m) {
		setName(name);
		setK(k);
		setE(e);
		setM(m);
	}
	
	public int getTotal() {
		return k + e + m;
	}
	
	public String getUser() {
		return "나의 이름은 "+getName()+"이고, 총점은 "+getTotal()+"입니다.";
	}
}
