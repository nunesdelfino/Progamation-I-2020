package exec04;

public class TesteRetangulo {
	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		double comprimento = -1;
		double largura = -1;
		comprimento = Leitor.LerDouble("comprimento");
		r.setComprimento(comprimento);
		largura = Leitor.LerDouble("largura");
		r.setLargura(largura);
		System.out.println(r.toString());
	}
}
