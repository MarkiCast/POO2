
public class Funcionario extends PessoaFisica{

	private int horas;
	private double valor;
	
	public Funcionario(int codigo, String nome, int cPF, int horas, double valor) {
		super(codigo, nome, cPF);
		this.horas = horas;
		this.valor = valor;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	private double salario = horas * valor;

	public double getSalario() {
		return salario;
	}
	
}
