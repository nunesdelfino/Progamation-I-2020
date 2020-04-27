package exec12;

import java.text.DecimalFormat;

public class Triangulo {
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public Triangulo() {
		super();
	}

	@Override
	public String toString() {
		return "Triangulo ["+
				"lado1=" + lado1 +
				", lado2=" + lado2 +
				", lado3=" + lado3 +
				", informações do triângulo=" + this.ValidaTriangulo() +
				"]";
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public String ValidaTriangulo() {
		DecimalFormat format = new DecimalFormat("#.00");
		if (this.getLado1() < (this.getLado2()+this.getLado3())
				&& this.getLado2() < (this.getLado1()+this.getLado3())
				&& this.getLado3() < (this.getLado1()+this.getLado2())) {
			return "O triângulo é válido! " +
				"area do triangulo=" + format.format(this.CalcularArea()) +
				" tipo do triângulo=" + this.TipoTriangulo();
		} else {
			return "O triângulo não é válido!";
		}
	}

	private String TipoTriangulo() {
		if (this.getLado1() == this.getLado2()
			&& this.getLado2() == this.getLado3()) {
			return "triangulo equilátero";
		} else if (this.getLado1() == this.getLado2() && this.getLado1() != this.getLado3()
					|| this.getLado1() == this.getLado3() && this.getLado1() != this.getLado3()
					|| this.getLado2() == this.getLado3() && this.getLado2() != this.getLado1()) {
			return "triângulo isósceles";
		} else {
			return "triângulo escaleno";
		}
	}

	private double CalcularArea() {
		double Area = (this.getLado1()+this.getLado2()+this.getLado3())/2; 
		return Math.sqrt(Area*
				(Area-this.getLado1())*
				(Area-this.getLado2())*
				(Area-this.getLado3())
				);
	}

}
