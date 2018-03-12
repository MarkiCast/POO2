package Herança;

public class VIP extends Ingresso{
	
	private int valorAdicional;

	public int getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(int valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public void valorVIP() {
		System.out.println("Preço VIP: "+valorAdicional+getValor());
	}
}
