package Herança;

public class Assistente extends Funcionario{

	private int numeroDeMatricula;
	
	public Assistente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assistente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	public Assistente(int numeroDeMatricula) {
		super();
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}
	
	@Override
	public void exibirDados() {}
	
}
