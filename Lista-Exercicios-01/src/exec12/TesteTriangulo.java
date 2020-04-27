package exec12;

public class TesteTriangulo {
	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		
		double lado1 = -1;
		double lado2 = -1;
		double lado3 = -1;
		
		lado1 = Leitor.LerInteiro("Lado 1");
		t.setLado1(lado1);
		lado2 = Leitor.LerInteiro("Lado 2");
		t.setLado2(lado2);
		lado3 = Leitor.LerInteiro("Lado 3");
		t.setLado3(lado3);
		
		System.out.println(t.toString());

	}
}
