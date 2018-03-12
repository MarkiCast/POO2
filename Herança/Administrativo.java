package Herança;

public class Administrativo extends Assistente{

	private String turno;
	
	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrativo(String turno) {
		super();
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	if(turno.equalsIgnoreCase("Noturno")) {
		@Override
		public double getSalario() {
			return getSalario()*1.25;
		}	
	}
	
}