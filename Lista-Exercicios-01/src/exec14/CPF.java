package exec14;

public class CPF {
	
	private String CPF;
	private char[] Vetor;

	public CPF(String cPF) {
		super();
		CPF = cPF;
	}

	public CPF() {
		super();
	}

	@Override
	public String toString() {
		return "CPF [CPF=" + CPF +
				", CPF=" + this.ValidaCPF() +
				"]";
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public char[] getVetor() {
		return Vetor;
	}

	public void setVetor(char[] vetor) {
		Vetor = vetor;
	}
	
	public String ValidaCPF() {
		String Status;
		Integer DV1;
		Integer DV2;
		
		DV1 = Multiplica(10, 9);
		
		DV2 = Multiplica(11, 10);
		
		if(DV1 == Character.getNumericValue(this.getCPF().charAt(9))
			&& DV2 == Character.getNumericValue(this.getCPF().charAt(10))) {
			Status = "Válido!";
		} else {
			Status = "Inválido!";
		}
		
		return Status;
	}
	
	public Integer Multiplica(int peso, int limite) {
		Integer resultado = 0;
		for (int i = 0; i < limite; i++) {
			resultado += Character.getNumericValue(this.getCPF().charAt(i)) * peso;
			peso--;
		}
		resultado = resultado%11;
		
		if(resultado < 2) {
			resultado = 0;
		} else {
			resultado = 11 - resultado;
		}
		
		return resultado;
	}
}
