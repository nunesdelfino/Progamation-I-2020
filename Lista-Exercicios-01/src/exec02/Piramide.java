package exec02;

import java.text.DecimalFormat;

public class Piramide {
	
	private double base;
	private double altura;
	
	public Piramide(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.00");
		return "Piramide [base= " + format.format(base) + 
				", altura= " + format.format(altura) +
				", volume= " + format.format(CalculaVolume()) +
				"]";
	}

	public double getBase() {
		return base;
	}
	public void setBase(Integer base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	
	public double CalculaVolume() {
		
		return this.getAltura() * this.getBase() * 1/3;
	}

}
