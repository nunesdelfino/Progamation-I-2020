package exec04;

import java.text.DecimalFormat;

public class Retangulo {
	
	private double comprimento;
	private double largura;
	
	public Retangulo() {
		super();
	}
	
	public Retangulo(double comprimento, double largura) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.00");
		return "Retangulo [comprimento=" + format.format(comprimento) +
				", largura=" + format.format(largura) +
				", area: " + format.format(this.CalculaArea()) +
				", perimetro: " + format.format(this.CalculaPerimetro()) +
				"]";
	}

	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		Validador.ValidarPositivo(comprimento, "Comprimento");
		this.comprimento = comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		Validador.ValidarPositivo(largura, "Largura");
		this.largura = largura;
	}
	
	public double CalculaArea() {
		return this.getLargura()*this.getComprimento();
	}
	
	public double CalculaPerimetro() {
		return this.getLargura()*2+this.getComprimento()*2;
	}

}

