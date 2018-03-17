// Aula 6

package Abstract;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantas formas geometricas deseja criar");
		int i = scan.nextInt();
		formasGeometricas[] lista = new formasGeometricas[i];
		
		do {
			//System.out.println("Deseja criar uma forma geometrica?\n"+
			//				     "Digite:\n"+
			//				     " 1 para não\n"+
			//		  		     " 2 para sim\n" );
			//switch(scan.nextInt()) {
			//		case 1: return;
			//		case 2:
			System.out.println("Que forma deseja criar?\n"+
							   "Digite:\n"+
							   " 1 para quadrado\n"+
							   " 2 para retangulo\n"+
							   " 3 para circulo");
					switch(scan.nextInt()) {
						case 1:{
							System.out.println("Digite o lado do seu quadrado");
							quadrado Quadrado = new quadrado(scan.nextInt());
							System.out.println("Dados:\n"+
											   "Lado: "+Quadrado.b+"\n"+
											   "Perimetro: "+Quadrado.calculaPerimetro()+"\n"+
											   "Area :"+Quadrado.calculaArea());
							lista[i-1] = Quadrado;
							break;
						}
						case 2:{
							System.out.println("Digite em ordem: Base e Altura");
							retangulo Retangulo = new retangulo(scan.nextInt(), scan.nextInt());
							System.out.println("Dados:\n"+
									   		   "Base: "+Retangulo.b+"\n"+
									   		   "Altura: "+Retangulo.a+"\n"+
									   		   "Perimetro: "+Retangulo.calculaPerimetro()+"\n"+
									   		   "Area :"+Retangulo.calculaArea());
							lista[i-1]= Retangulo;
							break;
						}
						case 3:{
							System.out.println("Digite o raio do seu circulo");
							circulo Circulo = new circulo(scan.nextInt());
							System.out.println("Dados:\n"+
									   		   "Raio :"+Circulo.r+"\n"+
									   		   "Perimetro: "+Circulo.calculaPerimetro()+"\n"+
									   		   "Area :"+Circulo.calculaArea());
							lista[i-1] = Circulo;
							break;
						}
					}		
		i--;
		}while(i > 0);	
		
	scan.close();	
	}
}

