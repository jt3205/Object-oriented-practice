package employee;

/* EmpŬ������ ��� ������ 
 * -salary:long
 * -bonus:long
 * 
 * +Engineer()
 * +Engineer(eno:int, ename:String, phone:String)
 * +toString():String
 * 
 *  [����]
 *  ���ʽ�+=150000�� �������� ����
 */
public class Engineer extends Emp{
	private long salary;
	private long bonus;
	public Engineer(){
		
	}
	public Engineer(int eno , String ename, String phone){
		super(eno,ename,phone);
	}
	public String toString(){
		return "\n사원번호 : "+super.getEno() + "\n사원이름 :" +super.getEname() +"\n내선번호 :"+super.getPhone() +
				"\n기본급여 "+salary+"\n보너스+수당 "+bonus+"\n지급금액 : "+(salary + bonus);
	}
	@Override
	public void setSalary(long salary){
		this.salary = salary;
	}
	@Override
	public void setBonus(long bonus){
		this.bonus = bonus+150000;
			
	}
}
