package exec03;

public class TesteEsfera {
	public static void main(String[] args) {
		Esfera e = new Esfera();
		double raio = -1;
		raio = Leitor.LerDouble("Raio");
		e.setRaio(raio);
		System.out.println(e.toString());
	}
}
