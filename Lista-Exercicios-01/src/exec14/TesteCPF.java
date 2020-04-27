package exec14;

import java.util.Scanner;

public class TesteCPF {
	public static void main(String args[]) {
		CPF c = new CPF();
		String str;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Insira um CPF: ");
		str = s.nextLine();
		c.setCPF(str);
		
		System.out.println(c.toString());
	}
}
