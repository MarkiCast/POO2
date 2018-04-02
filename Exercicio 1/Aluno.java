
public abstract class Aluno {

	private int matricula;
	private String nome;
	private int ano;
	private double nota1;
	private double nota2;
	
	public Aluno(int matricula, String nome, int ano, double nota1, double nota2) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.ano = ano;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
}
