package exec09;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private Integer horasTrabalhadas;
	private Integer valorHoras;
	
	public Funcionario(String nome, String cpf, Integer horasTrabalhadas, Integer valorHoras) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHoras = valorHoras;
	}

	public Funcionario() {
		super();
	}

	public Funcionario(String cpf, Integer horasTrabalhadas, Integer valorHoras) {
		super();
		this.cpf = cpf;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHoras = valorHoras;
	}

	@Override
	public String toString() {
		return "Funcionario ["
				+ "nome=" + nome +
				", cpf=" + cpf +
				", horasTrabalhadas=" + horasTrabalhadas +
				", valorHoras=" + valorHoras +
				", salario=" + this.CalculaSalario() +
				"]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Integer getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(Integer valorHoras) {
		this.valorHoras = valorHoras;
	}
	
	public Integer CalculaSalario() {
		return this.getHorasTrabalhadas()*this.getValorHoras();
	}
	
}