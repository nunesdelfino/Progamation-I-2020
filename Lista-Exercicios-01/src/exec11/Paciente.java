package exec11;

import java.text.DecimalFormat;

public class Paciente {
	
	private String nome;
	private double peso;
	private double altura;
	
	public Paciente(String nome, double peso, double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Paciente() {
		super();
	}

	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.00");
		return "Paciente ["+ 
				"nome=" + nome +
				", peso=" + peso +
				", altura=" + altura +
				", imc=" + format.format(this.CalculaIMC()) +
				", faixa de risco=" + this.ClassificaIMC() +
				"]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double CalculaIMC() {
		return this.getPeso()/Math.pow(this.getAltura(), 2);
	}
	
	public String ClassificaIMC() {
		if (this.CalculaIMC() < 20) {
			return "abaixo do peso ideal";
		} else if (this.CalculaIMC() < 25) {
			return "peso ideal";
		} else if (this.CalculaIMC() < 30) {
			return "execesso de peso";
		} else if (this.CalculaIMC() < 35) {
			return "obesidade";
		} else {
			return "obesidade mórbida";
		}
	}
}
