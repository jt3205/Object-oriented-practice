package emp;

import java.util.ArrayList;
import java.util.List;

//데이터 베이스에서 자원을 가져올 용도로 사용됨 (DAO : Data Access Object)
public class EmpDao {
	List<EmpVO> list = null;
	
	public EmpDao() {
		list=  new ArrayList<>();
		list.add(new EmpVO("kim","영업부",10000000));
		list.add(new EmpVO("lee","개발부",15000000));
		list.add(new EmpVO("park","관리부",18000000));
	}
	
	public List<EmpVO> getEmpList() {
		return list;
	}
	
	public EmpVO getEmp(String name) {
		for(EmpVO e : list) {
		if(name.equals(e.getEname())) 
			return e;
		}
		return null;
	}
			
}
