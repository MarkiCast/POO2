package Abstract;

public class retangulo extends quadrilatero{

	public retangulo(int b, int a) {
		this.b = b;
		this.a = a;
	}
	
	public int calculaArea() {
		return b*a;
	}
	
}
