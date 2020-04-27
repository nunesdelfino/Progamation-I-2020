package exec16;

public class TesteCalculadora {
	
	public static void main(String [] args) {
		Calculadora c = new Calculadora();
		
		double ValorUm;
		double ValorDois;
		int Opcao;
		
		ValorUm = Leitor.LerDouble("Valor um");
		c.setValorUm(ValorUm);
		
		ValorDois = Leitor.LerDouble("Valor dois");
		c.setValorDois(ValorDois);
		
		PrintMenu.Menu();
		
		Opcao = Leitor.LerOpcao();
		c.setopcao(Opcao);
		
		System.out.println(c.toString());
		
	}

}
