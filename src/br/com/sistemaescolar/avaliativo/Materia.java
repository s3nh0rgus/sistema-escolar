package br.com.sistemaescolar.avaliativo;
import br.com.sistemaescolar.exceptions.NotaForaDe0a10;

public class Materia {
	
	private String nome;
	private double notaDeAvaliacao;  //p
	private double notaDeParticipacao; //p
	private double mediaBimestral;
	
	public Materia (String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaDeAvaliacao() {
		return notaDeAvaliacao;
	}

	public void setNotaDeAvaliacao(double provaBimestral) { //exception0to10
		if(provaBimestral > 10.0 && provaBimestral < 0.0) {
			throw new NotaForaDe0a10();
		}
		this.notaDeAvaliacao = provaBimestral;
	}

	public double getNotaDeParticipacao() {
		return notaDeParticipacao;
	}

	public void setNotaDeParticipacao(int licoesFeitas, double notaDeDisciplina) { //exception0to10
		this.notaDeParticipacao = licoesFeitas * 0.5 + notaDeDisciplina;
		
		if(this.notaDeParticipacao > 10.0) {
			this.notaDeParticipacao = 10.0;
		}
		
		if(this.notaDeParticipacao < 0.0) {
			throw new NotaForaDe0a10();
		}
		
	}

	public double getMediaBimestral() {
		return mediaBimestral;
	}

	public void setMediaBimestral() {
		this.mediaBimestral = (this.getNotaDeAvaliacao() + this.getNotaDeParticipacao()) / 2;
	}
	
	public boolean aprovaOuReprova() {
		if(this.getMediaBimestral() < 7.0) {
			return false;
		}
		
		return true;
		
	}
	
}
