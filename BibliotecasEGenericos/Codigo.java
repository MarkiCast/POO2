package BibliotecasEGenericos;

public class Codigo<T,U> {

	private T fabrica;
	private U sequencial;
	
	public Codigo(T fabrica, U sequencial) {
		super();
		this.fabrica = fabrica;
		this.sequencial = sequencial;
	}

	public T getFabrica() {
		return fabrica;
	}

	public void setFabrica(T fabrica) {
		this.fabrica = fabrica;
	}


	public U getSequencial() {
		return sequencial;
	}

	public void setSequencial(U sequencial) {
		this.sequencial = sequencial;
	}

	@Override
	public String toString() {
		return "Codigo : [" + fabrica  + sequencial + "]";
	}

	
	
}
