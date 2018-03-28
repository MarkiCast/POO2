package BibliotecasEGenericos;

public class Produto<T,U,S,X>{
	
	private Codigo<T,U> codigo;
	private String descricao;
	private ValorM<S> preco;
	private X peso;
	
	public Produto(Codigo<T, U> codigo, String descricao, ValorM<S> preco, X peso) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.peso = peso;
	}

	public Codigo<T, U> getCodigo() {
		return codigo;
	}

	public void setCodigo(Codigo<T, U> codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ValorM<S> getPreco() {
		return preco;
	}

	public void setPreco(ValorM<S> preco) {
		this.preco = preco;
	}

	public X getPeso() {
		return peso;
	}

	public void setPeso(X peso) {
		this.peso = peso;
	}
	
}
