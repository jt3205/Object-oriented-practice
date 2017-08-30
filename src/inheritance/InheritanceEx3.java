package inheritance;

class Branch{
	public Branch(){
		this("hi");
		System.out.println("default Branch constructor");
		
	}
	public Branch(String str){
		System.out.println(str +" Branch constructor");
	}
}
class Leaf extends Branch{
	public Leaf(){
		this("hi");
		System.out.println("deafult Leaf constructor");
	}
	public Leaf(String str){
		super();
		System.out.println(str +" Leaf constructor");
	}
}
public class InheritanceEx3 {
	public static void main(String[]ar){
		new Leaf();
	}
}

/*
class Branch{
	public Branch(){
		System.out.println("default Branch constructor");
	}
	public Branch(String str){
		this();
		System.out.println(str +" Branch constructor");
	}
}
class Leaf extends Branch{
	
	public Leaf(String str){
		super(str);
		System.out.println(str +" Leaf constructor");
	}
}
public class InheritanceEx3 {
	public static void main(String[]ar){
		new Leaf("hi");
	}
}

*/