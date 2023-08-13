package br.com.sistemaescolar.teste;
import br.com.sistemaescolar.avaliativo.Boletim;
import br.com.sistemaescolar.avaliativo.Materia;
import br.com.sistemaescolar.pessoas.Aluno;

public class PassandoAnoLetivo {

	public static void main(String[] args) {
		
		Aluno gustavo = new Aluno("Gustavo", 12, 6);
		Materia historia = new Materia("História");
		Materia matematica = new Materia("Matemática");
		Materia portugues = new Materia("Português");
		Materia fisica = new Materia("Física");
		
		
		historia.setNotaDeParticipacao(2, 8.5);
		historia.setNotaDeAvaliacao(7.5); 
		historia.setMediaBimestral();
		
		matematica.setNotaDeParticipacao(5, 9.0);
		matematica.setNotaDeAvaliacao(6.5);
		matematica.setMediaBimestral();
		
		portugues.setNotaDeParticipacao(4, 7.0);
		portugues.setNotaDeAvaliacao(8.0);
		portugues.setMediaBimestral();
		
		fisica.setNotaDeParticipacao(5, 8.0);
		fisica.setNotaDeAvaliacao(5.0);
		fisica.setMediaBimestral();
		
		Boletim boletimDoGustavo = new Boletim(gustavo, 4);
		
		boletimDoGustavo.adicionaMateria(historia);
		boletimDoGustavo.adicionaMateria(matematica);
		boletimDoGustavo.adicionaMateria(portugues);
		boletimDoGustavo.adicionaMateria(fisica);
		
		gustavo.mostraDadosDoAluno();
		
		boletimDoGustavo.mostraBoletimDoAluno();
		
		gustavo.setAnoLetivo(boletimDoGustavo.passaDeAno());
		gustavo.mostraDadosDoAluno();
		
	}
	
}
