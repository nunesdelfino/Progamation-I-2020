package exec05;

import java.text.DecimalFormat;

public class Paralelepipedo {
	
	private double altura;
	private double largura;
	private double comprimento;
	
	public Paralelepipedo() {
		super();
	}
	
	public Paralelepipedo(double altura, double largura, double comprimento) {
		super();
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.00");
		return "Paralelepipedo [altura=" + format.format(altura) +
				", largura=" + format.format(largura) +
				", comprimento=" + format.format(comprimento) +
				", area: " + format.format(this.CalculaArea()) +
				", volume: " + format.format(this.CalculaVolume()) + 
				"]";
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double CalculaVolume() {
		return this.getLargura()*this.getComprimento()*this.getAltura();
	}
	
	public double CalculaArea() {
		return 2*(this.getAltura()*this.getLargura() + 
				this.getAltura()*this.getComprimento() + 
				this.getLargura()*this.getComprimento());
	}

}
