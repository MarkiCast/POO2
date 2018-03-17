package Abstract;

public class circulo implements formasGeometricas{

	public int r;

	public circulo(int r) {
		this.r = r;
	}
	
	public int calculaPerimetro() {
		return 2*3*r;
	}

	public int calculaArea() {
		return 3*r*r;
	}
	
}
