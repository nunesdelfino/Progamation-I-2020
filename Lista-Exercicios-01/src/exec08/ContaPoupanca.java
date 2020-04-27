package exec08;

public class ContaPoupanca {
	
	private String nome;
	private String numeroConta;
	private String agencia;
	private Integer saldoConta;
	
	public ContaPoupanca(String nome, String numeroConta, String agencia) {
		super();
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
	}

	public ContaPoupanca() {
		super();
	}

	@Override
	public String toString() {
		return "ContaPoupanca [nome=" + nome + ", numeroConta=" + numeroConta + ", agencia=" + agencia + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public Integer getSaldoConta() {
		return saldoConta;
	}
	
	public void setSaldoConta(Integer saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	public String MostraSaldo() {
		return Integer.toString(this.getSaldoConta());
	}
	
	public void RealizarSaque(Integer Saque) {
		this.setSaldoConta(this.getSaldoConta()-Saque);
	}
	
	public void RealizarDeposito(Integer Deposito) {
		this.setSaldoConta(this.getSaldoConta()+Deposito);
	}

}
