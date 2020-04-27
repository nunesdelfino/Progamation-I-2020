package exec03;

public class Validador {
	public static void ValidarPositivo(double Valor, String NomeAtributo) {
		if(Valor < 0) {
			throw new RuntimeException(NomeAtributo + "não aceita valor negativo!");
		}
	}
}
