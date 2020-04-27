package exec08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {
	public static double LerDouble(String nomeVariavel) {
		double Auxiliar = 0;
		
		do {
			Scanner leitor = new Scanner(System.in);
			System.out.printf("Digite a %s:",nomeVariavel);
			try {
				Auxiliar = leitor.nextDouble();
			} catch (InputMismatchException e) {
				System.out.printf("%s inválida, redigite!\n", nomeVariavel);
				leitor.nextLine();
			}
		} while (Auxiliar == 0);
		
		return Auxiliar;
	}
	
	public static Integer lerInteger(String nomeVariavel) {
		Integer Auxiliar = null;
		
		Auxiliar = (int) LerDouble(nomeVariavel);
		
		return Auxiliar;
	}
	
	public static int LerOpcao(String nomeVariavel) {
		int Auxiliar = -1;
		
		do {
			Auxiliar = (int) LerDouble(nomeVariavel);
		} while (Auxiliar < 1 && Auxiliar > 6);
		return Auxiliar;
	}
	
	public static String LerString(String nomeVariavel) {
		String Auxiliar = null;
		
		do {
			Scanner leitor = new Scanner(System.in);
			System.out.printf("Digite %s:",nomeVariavel);
			try {
				Auxiliar = leitor.nextLine();
			} catch (InputMismatchException e) {
				System.out.printf("%s inválida, redigite!\n", nomeVariavel);
				leitor.nextLine();
			}
		} while (Auxiliar == null);
		
		return Auxiliar;
		
	}
}
