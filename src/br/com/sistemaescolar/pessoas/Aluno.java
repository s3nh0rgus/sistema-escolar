package br.com.sistemaescolar.pessoas;

public class Aluno {
	
	private String nome;
	private int idade;
	private int anoLetivo;
	
	public Aluno(String nome, int idade, int anoLetivo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.anoLetivo = anoLetivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAnoLetivo() {
		return anoLetivo;
	}

	public boolean setAnoLetivo(boolean decisaoAvaliativa) {
		if(decisaoAvaliativa == false) {
			System.out.println("Infelizmente você não passou de ano!");
			return false;
		}
		
		if(anoLetivo == 9) {
			System.out.println("Parabéns! Você concluiu o ensino fundamental.");
			return false;
		}
		
		System.out.println("Parabéns! Você passou de ano!");
		this.anoLetivo++;
		return true;
	}

	public void mostraDadosDoAluno() {
		System.out.println("==Dados do Aluno==");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Série: " + this.getAnoLetivo());
	}
	
}
