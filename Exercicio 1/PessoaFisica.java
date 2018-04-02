
public class PessoaFisica {

	private int codigo;
	private String nome;
	private int CPF;
	
	public PessoaFisica(int codigo, String nome, int cPF) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		CPF = cPF;
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

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

}
