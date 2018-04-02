
public class CursoAnual extends Aluno implements Aprovacao{

	private double nota3;
	private double nota4;
	
	public CursoAnual(int matricula, String nome, int ano, double nota1, double nota2, double nota3, double nota4) {
		super(matricula, nome, ano, nota1, nota2);
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public void aprovacao() {
		
		double media = getNota2() * 0.4 + nota4 * 0.4 + nota3 * 0.1 + getNota1() * 0.1;
		
		if(media >= 7)
			System.out.println("Aprovad0");
		else
			System.out.println("Reprovado");
	}

}
