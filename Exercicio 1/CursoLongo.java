
public class CursoLongo extends Aluno implements Aprovacao{

	private double nota3;

	public CursoLongo(int matricula, String nome, int ano, double nota1, double nota2, double nota3) {
		super(matricula, nome, ano, nota1, nota2);
		this.nota3 = nota3;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public void aprovacao() {
		
		double media = (getNota1() + getNota2() + nota3) / 3;
		Character conceito = null;
		
		if(media > 9.01) 
			conceito = 'A';
		
		else if((media > 7.01) || (media <= 9))
			conceito = 'B';
		
		else if((media > 5.01) || (media <= 7))
			conceito = 'C';
		
		else if(media <= 5)
			conceito = 'D';
		
		if((conceito.equals('A')) || (conceito.equals('B')))
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
	}
	
}
