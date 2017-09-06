package StaticEx;

public class StaticEx2 {
	public static void main(String[] args) {
		System.out.println("** 입금당시의 금리 **");
		BankAccount ba1 = new BankAccount(1994, "kim", 1000, 0.07);
		BankAccount ba2 = new BankAccount(1998, "lee", 1000, 0.12);
		BankAccount ba3 = new BankAccount(2005, "park", 1000, 0.05);

		System.out.println("\n** 2005년 현재의 금리 **");
		ba1.view();
		ba2.view();
		ba3.view();
		
		System.out.println("\n** 0.04로 변동된 금리 **");
		
		BankAccount.setRate(0.11);
		
		ba1.view();
		ba2.view();
		ba3.view();
	}
}
