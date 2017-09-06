package abstractEx;

abstract class A{
	abstract public void view1();
	public void view2() {}
}

class B extends A {
	@Override
	public void view1() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractEx1 {
	public static void main(String[] args) {
		A a = new B();
		a.view1();
	}
}

/*class A{
	public void view1() {System.out.println("aa v1");}
	public void view2() {}
}

class B extends A{
	@Override
	public void view1() {System.out.println("bb v1");}
}

public class AbstractEx1 {
	public static void main(String[] args) {
		A a = new B();
		a.view1();
	}
}
*/