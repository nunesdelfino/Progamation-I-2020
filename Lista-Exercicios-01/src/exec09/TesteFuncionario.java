package exec09;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		String nome = null;
		String cpf = null;
		Integer horasTrabalhadas = null;
		Integer valorHoras = null;
		
		nome = Leitor.LerString("Nome");
		f.setNome(nome);
		
		cpf = Leitor.LerString("CPF");
		f.setCpf(cpf);
		
		horasTrabalhadas = Leitor.LerInteiro("Horas Trabalhadas");
		f.setHorasTrabalhadas(horasTrabalhadas);
		
		valorHoras = Leitor.LerInteiro("Valor de Horas");
		f.setValorHoras(valorHoras);
		
		System.out.println(f.toString());
	}
}