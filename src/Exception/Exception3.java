package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked exception
public class Exception3 {
	String str;

	public Exception3(){
		input();
	}
	
	public void input()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���ڿ� �Է�:");
		try {
		str=br.readLine();
		}catch(IOException e){
			
		}
	}
	
	public void output() {
		System.out.println("����� : " + str); 
	}
	
	public static void main(String[] args){
		new Exception3().output();
		
		
		
	}
}

