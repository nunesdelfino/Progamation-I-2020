package exec07;

import java.text.DecimalFormat;

public class Cone {
	
	private double raio;
	private double altura;
	
	public Cone() {
		super();
	}
	
	public Cone(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}

	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("##.00");
		return "Cone [raio=" + format.format(raio) +
				", altura=" + format.format(altura) +
				", geratiz=" + format.format(this.CalculaGeratriz()) +
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
	
	public double CalculaGeratriz() {
		return Math.sqrt(Math.pow(this.getAltura(), 2))+
				Math.pow(this.getRaio(), 2);
	}
	
	public double CalculaAreaLateral() {
		return Math.PI*this.getRaio()*this.CalculaGeratriz();
	}
	
	public double CalculaAreaTotal() {
		return Math.PI*this.getRaio()*(this.CalculaGeratriz()+this.getRaio());
	}
	
	public double CalculaVolume() {
		return 1.0/3.0*Math.PI*Math.pow(this.getRaio(), 2)*this.getAltura();
	}
	
	

}
