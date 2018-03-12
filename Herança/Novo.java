package Herança;

public class Novo extends Imovel{

	private int valorAdicional;

	public int getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(int valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimirValor() {
		System.out.println("Valor do imovel novo: "+getPreço()+valorAdicional);
	}
}
