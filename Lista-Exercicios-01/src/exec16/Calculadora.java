package exec16;

import java.text.DecimalFormat;

public class Calculadora {
	
	private double valorUm;
	private double valorDois;
	private int opcao;
	
	public Calculadora() {
		super();
	}
	
	public Calculadora(double valorUm, double valorDois) {
		super();
		this.valorUm = valorUm;
		this.valorDois = valorDois;
	}
	
	@Override
	public String toString() {
		return "Calculadora [valorUm=" + valorUm +
				", valorDois=" + valorDois +
				", conta= " + this.Resultado() +
				"]";
	}

	public double getValorUm() {
		return valorUm;
	}
	public void setValorUm(double valorUm) {
		this.valorUm = valorUm;
	}
	public double getValorDois() {
		return valorDois;
	}
	public void setValorDois(double valorDois) {
		this.valorDois = valorDois;
	}
	public int getOpcao() {
		return opcao;
	}
	public void setopcao(int opcao) {
		this.opcao = opcao;
	}
	
	public String Resultado() {
		DecimalFormat format = new DecimalFormat("#.00");
		
		switch(this.getOpcao()){
        case 1:
            return "A Adição de " + this.getValorUm() + " e " + this.getValorDois() + " é " + format.format(this.getValorUm()+this.getValorDois());
        case 2:
        	return "A Subtração de " + this.getValorUm() + " e " + this.getValorDois() + " é " + format.format(this.getValorUm()-this.getValorDois());
        case 3:
        	return "A Multiplicação de " + this.getValorUm() + " e " + this.getValorDois() + " é " + format.format(this.getValorUm()*this.getValorDois());
        case 4:
        	return "A Divisão de " + this.getValorUm() + " por " + this.getValorDois() + " é " + format.format(this.getValorUm()/this.getValorDois());
        case 5:
        	return "A Potenciação de " + this.getValorUm() + " por " + this.getValorDois() + " é " + format.format(Math.pow(this.getValorUm(), this.getValorDois()));
        case 6:
        	return "A Radiciação de " + this.getValorUm() + " é " + format.format(Math.sqrt(this.getValorUm()));
            
        default:
            return "Opcão inválida!";
    }
	}
}
