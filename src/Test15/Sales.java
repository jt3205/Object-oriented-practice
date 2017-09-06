package Test15;

import java.util.Scanner;

public class Sales {
	String article;
	int qty;
	int cost;
	static int cnt;
	static double discount;
	
	public Sales() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("품목 : ");
		article = scanner.nextLine();
		System.out.print("수량 : ");
		qty = scanner.nextInt();
		System.out.print("단가 : ");
		cost = scanner.nextInt();
	}
}
