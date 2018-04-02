
public class CursoSemestral extends Aluno implements Aprovacao{

	private double nota3;
	private int semestre;
	
	public CursoSemestral(int matricula, String nome, int ano, int semestre, double nota1, double nota2, double nota3) {
		super(matricula, nome, ano, nota1, nota2);
		this.nota3 = nota3;
		this.semestre = semestre;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public void aprovacao() {
		if(nota3 * 0.5 + getNota2() * 0.25 + getNota1() * 0.25 >= 6)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
	}
	
}
