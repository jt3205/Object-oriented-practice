package Test16;

import java.util.Scanner;

public class Test16 extends Height {
	public static void main(String[] args) {
		Test16 test = new Test16();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		double user = scanner.nextDouble();
		System.out.println("결과 : "+test.getInch(user)+"인치");
	}

	@Override
	double getInch(double cm) {
		return cm/INCH;
	}

}
