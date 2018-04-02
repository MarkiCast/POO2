
public abstract class Imovel {

	int codigo;
	String rua;
	String bairro;
	String cidade;
	int numero;
	double area;
	double preço;
	
	public Imovel(int codigo, String rua, String bairro, String cidade, int numero, double area, double preço) {
		super();
		this.codigo = codigo;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.numero = numero;
		this.area = area;
		this.preço = preço;
	}
	
}
