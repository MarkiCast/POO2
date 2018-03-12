package Herança;

public class Tecnico extends Assistente{
	
	public Tecnico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tecnico(int numeroDeMatricula) {
		super(numeroDeMatricula);
		// TODO Auto-generated constructor stub
	}

	public Tecnico(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalario() {
		return getSalario()*1.25;
	}
	
	
}
