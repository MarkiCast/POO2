package Herança;

public class Velho extends Imovel{

	@Override
	public int getPreço() {
		return (int) (getPreço()*0.85);
	}
}
