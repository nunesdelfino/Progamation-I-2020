package exec15;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Eleitor {
	
	private String nome;
	private String dataNascimento;
	
	
	public Eleitor(String nome, String dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Eleitor() {
		super();
	}

	@Override
	public String toString() {
		return "Eleitor [nome=" + nome +
				", dataNascimento=" + dataNascimento +
				", tipo eleitor=" + this.TipoEleitor() +
				"]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String TipoEleitor() {
		
		LocalDate DataAtual = LocalDate.now();
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
	    LocalDate DataUsuario = LocalDate.parse(this.getDataNascimento(), dateFormat);
	    
	    Period periodo = Period.between(DataUsuario, DataAtual);
	    
	    if(periodo.getYears() < 16) {
	    	return "Não eleitor";
	    } else if (periodo.getYears() < 18 || periodo.getYears() > 65) {
	    	return "Eleitor facultativo";
	    } else {
	    	return "Eleitor obrigatório";
	    }
	    
	}
}
