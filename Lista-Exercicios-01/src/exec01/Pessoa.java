package exec01;

import java.text.DecimalFormat;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private float peso;
	private float altura;
	
	public Pessoa(String nome, Integer idade, float peso, float altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.00");
		return "Pessoa [nome=" + nome +
				", idade=" + idade +
				", peso=" + peso +
				", altura=" + altura +
				", IMC: "+ format.format(this.CalcularIMC())+
				"]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public double CalcularIMC() {
		
		return this.getPeso() / Math.pow(this.getAltura(), 2);
	}

}
