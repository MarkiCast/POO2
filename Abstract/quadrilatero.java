package Abstract;

public abstract class quadrilatero implements formasGeometricas{
	
	public int b;
	public int a;
	
	public quadrilatero() {
		super();
	}
		
	public int calculaPerimetro() {
		return 2*b+2*a;
	}

	public int calculaArea() {
		return b*a;
	}
}
