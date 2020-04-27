package exec09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {
	
	public static int LerInteiro(String nomeVariavel) {
		Integer Auxiliar = null;
		
		do {
			Scanner leitor = new Scanner(System.in);
			System.out.printf("Digite %s:",nomeVariavel);
			try {
				Auxiliar = leitor.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("%s inválida, redigite!\n", nomeVariavel);
				leitor.nextLine();
			}
		} while (Auxiliar == null);
		return Auxiliar;
	}
	
	public static String LerString(String nomeVariavel) {
		String Auxiliar = null;
		
		Scanner leitorString = new Scanner(System.in);
		System.out.printf("Digite %s:",nomeVariavel);
		Auxiliar = leitorString.nextLine();
		
		return Auxiliar;
	}

}
