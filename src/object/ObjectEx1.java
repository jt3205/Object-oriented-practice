package object;


class Person{
	public String name;
	public int age;
	public float score;
	
	public void setPerson(String name, int age, float score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public void viewPerson(){
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("����:"+score);
	}
}

public class ObjectEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ob1 = new Person();
		ob1.setPerson("������", 20, 73.5f);
		ob1.viewPerson();
		
		Person ob2 = new Person();
		ob2.setPerson("�ε鷡", 17, 90.5f);
		ob2.viewPerson();
	}
	
}

/*  -(private) , +(public) , #(protected)
 *  
 *  Ŭ������ : Person
 *  +name:String
 *  +age:int
 *  +score:float
 *  
 *  +setPerson(na:String, a:int, s:float) : void
 *  +viewPerson():void 
 */
// ObjectEx1.java  ==> ObjectEx1.class, Person.class