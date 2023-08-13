package br.com.sistemaescolar.avaliativo;
import br.com.sistemaescolar.pessoas.Aluno;

public class Boletim {

	private Aluno aluno;
	private Materia[] materias;
	private int contador = 0;
	
	public Boletim(Aluno aluno, int gradeCurricular) {
		this.aluno = aluno;
		materias = new Materia[gradeCurricular];
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public void adicionaMateria(Materia materia) {
		if(materias[contador] == null) {
			materias[contador] = materia;
			contador++;
		} else {
			System.out.println("Operação Invalida: Dado já alocado nessa parte da lista."); //exception
		}
	}
	
	public void mostraNotasDoAluno(int i) {
		System.out.println("Aluno: " + aluno.getNome());
		System.out.println("Matéria: " + materias[i].getNome());
		System.out.println("Nota de Paticipação: " + materias[i].getNotaDeParticipacao());
		System.out.println("Nota de Avaliação: " + materias[i].getNotaDeAvaliacao());
		System.out.println("Média Bimestral: " + materias[i].getMediaBimestral());
	}
	
	public void mostraBoletimDoAluno() {
		System.out.println("==================================");
		System.out.println("Boletim do Aluno: " + aluno.getNome());
		// enhanced-for
		for(Materia materia : materias) {
			if(materia != null) {
				System.out.println("Matéria: " + materia.getNome());
				System.out.println("Nota: " + materia.getMediaBimestral());
			}
		}
		System.out.println("==================================");
	}
	
	public boolean passaDeAno() {
		int materiasPassadas = 0;
		for(int i = 0; i < materias.length; i++) {
			if(materias[i].aprovaOuReprova()) {
				materiasPassadas++;
			}
		}
		
		if (materias.length == materiasPassadas) {
			return true;
		} else {
			return false;
		}
	}
	
}
