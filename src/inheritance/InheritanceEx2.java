package inheritance;

class ParentEx{
	public ParentEx(){
		System.out.println("parent class");
	}
}
class ChildEx extends ParentEx{
	public ChildEx(){
		System.out.println("child class");
	}
}
public class InheritanceEx2 {
	public static void main(String []ar){
		new ChildEx();
	}
}
