package exec15;


public class TesteEleitor {

	public static void main(String[] args) {
		
		Eleitor e = new Eleitor();
		
		String Data;
		String Nome;
		
		Nome = Leitor.LerString("o nome");
		e.setNome(Nome);
		
		Data = Leitor.LerString("uma data no formato dd/mm/aaaa");
		e.setDataNascimento(Data);
		
		
		System.out.println(e.toString());
		
	}

}
