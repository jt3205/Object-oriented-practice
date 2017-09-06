package Test18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowEx {
	int dan;
	public void inputData() {
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
		String user = null;
		try {
			System.out.print("단 입력 : ");
			user = bufReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			dan = Integer.parseInt(user);
			guguPrint();
		} catch (NumberFormatException e) {
			System.out.println("정수값만 입력해 주세요.");
		} finally {
			try {
				bufReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void guguPrint() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = "+dan*i);
		}
	}
}
