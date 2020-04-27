package exec08;

import java.io.IOException;

public class TesteContaPoupanca {
	public static void main(String[] args) throws IOException {
		ContaPoupanca p = new ContaPoupanca();
		
		String nome;
		String numeroConta;
		String agencia;
		Integer saldoConta;
		int Opcao;
		
		Integer Dinheiro;
		
		nome = Leitor.LerString("nome");
		p.setNome(nome);
		
		numeroConta = Leitor.LerString("número da conta");
		p.setNumeroConta(numeroConta);
		
		agencia = Leitor.LerString("agencia");
		p.setAgencia(agencia);
		
		saldoConta = Leitor.lerInteger("saldo da conta");
		p.setSaldoConta(saldoConta);
		
		do {
			
			PrintMenu.Menu();
			
			Opcao = Leitor.LerOpcao("opcao");
			
			switch(Opcao) {
			case 1:
				System.out.println(p.MostraSaldo());
				System.out.println("Press Enter to continue…");
				System.in.read();
				break;
			case 2:
				Dinheiro = Leitor.lerInteger("valor a sacar");
				p.RealizarSaque(Dinheiro);
				System.out.println("Operação realizada!");
				System.out.println("Press Enter to continue…");
				System.in.read();
				break;
			case 3:
				Dinheiro = Leitor.lerInteger("valor a depositar");
				p.RealizarDeposito(Dinheiro);
				System.out.println("Operação realizada!");
				System.out.println("Press Enter to continue…");
				System.in.read();
				break;
			case 4:
				System.out.println("Saindo...");
				break;
			default:
				break;
			}
		} while(Opcao != 4);
		

		System.out.println("Finalizado");
	}
}
