package exec16;

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
	
	public static int LerOpcao() {
		int Auxiliar = -1;
		
		do {
			Auxiliar = (int) LerDouble("opcão");
		} while (Auxiliar < 1 && Auxiliar > 6);
		return Auxiliar;
	}
}
