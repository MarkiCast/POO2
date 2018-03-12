//Aula 4

package Herança;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Tecnico tec = new Tecnico();
		Administrativo adm = new Administrativo();
		
		System.out.println(tec.getNome()+" :"+tec.getNumeroDeMatricula()+" "+adm.getNome()+" :"+adm.getNumeroDeMatricula());
		
		System.out.println("Compra de ingressos: Digite 1 para ingresso normal, 2 para ingresso VIP");
		switch(scan.nextInt()) {
			
			case 1: {
				Normal ing = new Normal();
				ing.normal();
				break;
			}
			case 2:
				System.out.println("Digite 1 para camarote superior e 2 para camarote inferior");
				switch(scan.nextInt()) {
					
					case 1:{
						CamaroteSuperior ing = new CamaroteSuperior();
						System.out.println("Valor do ingresso: "+ing.valorIngresso());
					}
					case 2:{
						CamaroteInferior ing = new CamaroteInferior();
						ing.valorVIP();
					}
				}
		}
		System.out.println("Imovel: digite 1 para imovel novo e 2 para imovel velho");
		switch(scan.nextInt()) {
			case 1:{
				Novo novo = new Novo();
				novo.imprimirValor();
			}
			case 2:{
				Velho velho = new Velho();
				System.out.println("Preço do imovel: "+velho.getPreço());
			}
		}
		
		
		Gerente gnt = new Gerente();
			
		
		
	}

}
