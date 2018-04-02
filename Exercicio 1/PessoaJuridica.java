
public class PessoaJuridica {

	private int codigo;
	private String nome;
	private int CNPJ;
	private double salario;
	
	public PessoaJuridica(int codigo, String nome, int cNPJ, double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		CNPJ = cNPJ;
		this.salario = salario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
