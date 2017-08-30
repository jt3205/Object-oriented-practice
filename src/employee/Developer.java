package employee;

/* Emp≈¨∑°Ω∫∏¶ ªÛº”πﬁ¿∫»ƒ
 * -salary:long
 * -bonus:long
 * 
 * +Develoer()
 * +Developer(eno:int, ename:String, phone:String)
 * +toString():String
 * 
 *  [¡∂∞«]
 *  ∫∏≥ Ω∫+=100000¿ª ºˆ¥Á¿∏∑Œ ¡ˆ±ﬁ
 */
public class Developer extends Emp{
	private long salary;
	private long bonus;
	
	public Developer(){
		
	}
	public Developer(int eno, String ename,String phone){
		super(eno,ename,phone);
	}
	@Override
	public void setSalary(long salary){
		this.salary = salary;
	}
	@Override
	public void setBonus(long bonus){
		this.bonus = bonus+100000;
	}
	public String toString(){
		return "사원번호 : "+super.getEno() + "\n사원이름 :" +super.getEname() +"\n내선번호 :"+super.getPhone() +
				"\n기본급여 "+salary+"\n보너스+수당 "+bonus+"\n지급금액 : "+(salary + bonus);
		
	}
}





