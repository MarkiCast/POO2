package Herança;

public class Gerente extends Funcionario{

	private	int senha;
	private	int numeroDeFuncionariosGerenciados;
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gerente(int senha, int numeroDeFuncionariosGerenciados) {
		super();
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}
	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public Empregado adicioneEmpregadoGerenciado() {
		
		
		return;
	}
}
