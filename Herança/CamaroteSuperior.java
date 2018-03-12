package Herança;

public class CamaroteSuperior extends VIP{

	private int valorAdicional;

	public int getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(int valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public int valorIngresso() {
		return (valorAdicional + getValor());
	}
}
