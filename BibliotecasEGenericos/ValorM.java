package BibliotecasEGenericos;

public class ValorM<T> {

	private T value;

	public ValorM(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
