package exec06;

public class TesteCilindro {
	public static void main(String[] args) {
		Cilindro c = new Cilindro();
		
		double raio = -1;
		double altura = -1;
		
		raio = Leitor.LerDouble("Raio");
		c.setRaio(raio);
		altura = Leitor.LerDouble("Altura");
		c.setAltura(altura);
		
		System.out.println(c.toString());
	}
}
