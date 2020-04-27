package exec03;

import java.text.DecimalFormat;

public class Esfera {
	
	private double raio;

	public Esfera(double raio) {
		super();
		this.raio = raio;
	}

	public Esfera() {
		super();
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.00");
		return "Esfera [raio=" + format.format(raio) +
				", Area Total: " + format.format(this.CalculaAreaTotal()) +
				", Volume: " + format.format(this.CalculaVolume()) +
				"]";
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		Validador.ValidarPositivo(raio, "Raio");
		this.raio = raio;
	}
	
	public double CalculaAreaTotal() {
		return 4*3.1415*Math.pow(this.getRaio(), 2);
	}
	
	public double CalculaVolume() {
		return (4/3)*3.1415*Math.pow(this.getRaio(), 3);
	}
	

}
