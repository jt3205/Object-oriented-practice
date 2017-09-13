package emp;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDao dao = new EmpDao();
		System.out.println("** 모든 사원 출력하기 **");
		
		List<EmpVO> list = dao.getEmpList();
		for(EmpVO e : list) 
			System.out.println("\n이름 : "+e.getEname()
								+"\n부서 : "+e.getDept()
					+"\n급여 : "+e.getSalary());
		
		System.out.println("lee사원 출력하기 ");
		EmpVO em = dao.getEmp("kim");
		
		if(em == null) System.out.println("찾는 사원이 없습니다.");
		else System.out.println(em.getEname()+"  "+em.getDept()+"  "+em.getSalary());
	}
	/*
	 * 이름 : kim
	 * 부서 : 영업부
	 * 급여 : 1000000
	 * 
	 * 이름 : kim
	 * 부서 : 영업부
	 * 급여 : 1000000
	 * 
	 * 이름 : kim
	 * 부서 : 영업부
	 * 급여 : 1000000
	 * 
	 */

}
