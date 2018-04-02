import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		
	CursoAnual aluno1 = new CursoAnual( 01, "Marcelo", 2016, 2.0, 4.0, 3.0, 5.0 );
	CursoCurto aluno2 = new CursoCurto( 02, "Bianca", 2017, 3, 5.0, 6.0);
	CursoSemestral aluno3 = new CursoSemestral( 03, "Leo", 2018, 2, 6.0, 8.0, 7.5);
	CursoLongo aluno4 = new CursoLongo( 04, "Emily", 1950, 10.0, 9.0, 9.5);
	
	ArrayList<Aprovacao> array = new ArrayList<>();
	array.add(aluno1);
	array.add(aluno2);
	array.add(aluno3);
	array.add(aluno4);
	
	for(int i = 0; i < array.size(); i++) {
		array.get(i).aprovacao();
	}
	
	}

}
