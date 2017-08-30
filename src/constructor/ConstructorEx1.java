package constructor;

public class ConstructorEx1 {
	public ConstructorEx1(){
		System.out.print("default Constructor");
	}
	public ConstructorEx1(String str){
		System.out.print(str+" Constructor");
	}
	public ConstructorEx1(String str,int num){
		System.out.print(str+num+" Constructor");
	}
	
	public static void main(String []ar){
		ConstructorEx1 ob = new ConstructorEx1();
		ConstructorEx1 ob1 = new ConstructorEx1("가나다");
		ConstructorEx1 ob2 = new ConstructorEx1("가나다",10);
		
	}
}
