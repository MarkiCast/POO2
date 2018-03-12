package Herança;

public class Empregado extends Funcionario{

	private int numeroDeMatricula;
	
	public Empregado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empregado(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	public Empregado(int numeroDeMatricula) {
		super();
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

}
