
public class FuncionarioComissionado extends PessoaFisica{

	private double totalVendido;
	private double comissao;
	
	public FuncionarioComissionado(int codigo, String nome, int cPF, double totalVendido, double comissao) {
		super(codigo, nome, cPF);
		this.totalVendido = totalVendido;
		this.comissao = comissao;
	}

	public double getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	private double salario = totalVendido * comissao;

	public double getSalario() {
		return salario;
	}
	
}
