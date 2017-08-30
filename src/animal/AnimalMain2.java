package animal;

import java.util.Scanner;

public class AnimalMain2 {
	public static void main(String []ar){
		Scanner sc = new Scanner(System.in);
		int n;
		Animal ani = null;
		while(true){
			System.out.print("1. Dog 2.Cat 3.Fish 4.Duck 5.Exit\n 선택 :");
			n = sc.nextInt();
			switch(n){
				case 1:  ani = new Dog();  break;
				case 2:  ani = new Cat();  break;
				case 3:  ani = new Fish(); break;
				case 4:  ani = new Duck(); break;
				default :System.out.println("종료합니다");
						 sc.close();
						 System.exit(0);
			}
			ani.speak(); ani.walk();
		}
	}
}
