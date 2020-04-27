package exec07;

public class TesteCone {
	public static void main(String[] args) {
		Cone c = new Cone();
		double raio = -1;
		double altura = -1;
		raio = Leitor.LerDouble("Raio");
		c.setRaio(raio);
		altura = Leitor.LerDouble("Altura");
		c.setAltura(altura);
		System.out.println(c.toString());
	}
}
