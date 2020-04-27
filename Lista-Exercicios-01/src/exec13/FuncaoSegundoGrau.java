package exec13;

public class FuncaoSegundoGrau {
	
	private int primeiroTermo;
	private int segundoTermo;
	private int terceiroTermo;
	private int valorX;
	
	public FuncaoSegundoGrau() {
		super();
	}
	
	public FuncaoSegundoGrau(int primeiroTermo, int segundoTermo, int terceiroTermo, int valorX) {
		super();
		this.primeiroTermo = primeiroTermo;
		this.segundoTermo = segundoTermo;
		this.terceiroTermo = terceiroTermo;
		this.valorX = valorX;
	}
	
	@Override
	public String toString() {
		return "FuncaoSegundoGrau [primeiroTermo=" + primeiroTermo +
				", segundoTermo=" + segundoTermo +
				", terceiroTermo=" + terceiroTermo +
				", valorX=" + valorX + "]";
	}

	public int getPrimeiroTermo() {
		return primeiroTermo;
	}
	public void setPrimeiroTermo(int primeiroTermo) {
		this.primeiroTermo = primeiroTermo;
	}
	public int getSegundoTermo() {
		return segundoTermo;
	}
	public void setSegundoTermo(int segundoTermo) {
		this.segundoTermo = segundoTermo;
	}
	public int getTerceiroTermo() {
		return terceiroTermo;
	}
	public void setTerceiroTermo(int terceiroTermo) {
		this.terceiroTermo = terceiroTermo;
	}
	public int getValorX() {
		return valorX;
	}
	public void setValorX(int valorX) {
		this.valorX = valorX;
	}
	
}
