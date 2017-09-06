package Test15;

import java.util.Scanner;

public class Test15 extends Sales {
	private int amount;
	
	public static void main(String[] args) {
		Test15 test[] = new Test15[2];
		for (int i = 0; i < test.length; i++) {
			test[i] = new Test15();
			test[i].setProgess();
			System.out.println();
		}
		System.out.print("할인율 : ");
		setDiscount(new Scanner(System.in).nextDouble());
		
		System.out.println("[[ 판매가 ]]");
		for (Test15 test15 : test) {
			test15.getDisplay();
		}
		System.out.println();
		
		System.out.print("판매건수 : ");
		int cnt = 0;
		for (Test15 test15 : test) {
			cnt += test15.qty;
		}
		System.out.println(cnt);
	}
	
	public void setProgess() {
		amount = qty * cost;
	}
	
	public void getDisplay() {
		System.out.println(article + "\t\t" + amount);
	}
	
	public static void setDiscount(double val) {
		discount -= val;
	}
}
