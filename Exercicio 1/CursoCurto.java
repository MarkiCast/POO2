
public class CursoCurto extends Aluno implements Aprovacao{
	
	private int mes;
	private double media = (getNota1() + getNota2()) / 2;
	
	public CursoCurto(int matricula, String nome, int ano, int mes, double nota1, double nota2) {
		super(matricula, nome, ano, nota1, nota2);
		this.mes = mes;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public void aprovacao() {
		if(media >= 5)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
	}

}
