package test;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String id, pw;
		
		System.out.println("ID를 입력하시오 "); id = sc.next();
		System.out.println("PW를 입력하시ㅏ오 "); pw = sc.next();
		
		UserProc up = new UserProc();
		User user = up.getLoginUser(id, pw);
		
		if(user == null) System.out.println("ID 또는 PW가 틀리거나 존재하지 않는 ID 입니다.");
		else System.out.println(user.getName()+"님이 입장하셨습니다.\n현재 포인트는 "+user.getPoint()+"점 입니다.");
		
		BookProc bp = new BookProc();
		
		System.out.println("[[ Book의 정보보기 ]]");
		for(Book b : bp.getList())
			System.out.println("책이름 : "+b.getTitle()+"\t책저자 : "+b.getAuthor()+"\t페이지 : "+b.getPage());
	
	}
}
