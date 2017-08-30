package Test14;

public class DerivedTest extends BaseTest {
	String department = "홍보";
	
	@Override
	public void getDisplay() {
		super.getDisplay();
		System.out.println("부서 : "+department);
	}
}
