package exec06;

import java.text.DecimalFormat;

import exec04.Validador;

public class Cilindro {
	
	private double raio;
	private double altura;
	
	public Cilindro() {
		super();
	}

	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}

	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.00");
		return "Cilindro [raio=" + format.format(raio) +
				", altura=" + format.format(altura) +
				", area lateral=" + format.format(this.CalculaAreaLateral()) +
				", area total=" + format.format(this.CalculaAreaTotal()) +
				", volume=" + format.format(this.CalculaVolume()) +
				"]";
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		Validador.ValidarPositivo(raio, "Raio");
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		Validador.ValidarPositivo(altura, "Altura");
		this.altura = altura;
	}

	public double CalculaAreaLateral() {
		return 2*Math.PI*this.getRaio()*this.getAltura();
	}

	public double CalculaAreaTotal() {
		return 2*Math.PI*this.getRaio()*(this.getAltura()+this.getRaio());
	}

	public double CalculaVolume() {
		return Math.PI*Math.pow(this.getRaio(), 2)*this.getAltura();
	}
	
	

}
