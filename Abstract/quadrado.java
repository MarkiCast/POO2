package Abstract;

public class quadrado extends quadrilatero{
		
	public quadrado(int b) {
		this.b = b;
	}
	
	public int calculaPerimetro() {
		return b*4;
	}

	public int calculaArea() {
		return b*b;
	}
	
	
}
