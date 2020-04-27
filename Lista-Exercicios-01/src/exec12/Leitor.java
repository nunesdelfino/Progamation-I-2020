package exec12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {
	
	public static int LerInteiro(String nomeVariavel) {
		Integer Auxiliar = null;
		
		do {
			Scanner leitor = new Scanner(System.in);
			System.out.printf("Digite a %s:",nomeVariavel);
			try {
				Auxiliar = leitor.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("%s inválida, redigite!\n", nomeVariavel);
				leitor.nextLine();
			}
		} while (Auxiliar < 0);
		
		return Auxiliar;
	}
}
