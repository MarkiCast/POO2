package Exercicios;

import java.util.Scanner;

public class ExercicioControle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		/*
		 *  Exercicio 1
		*/
		
		int c = 0;
		int s = 1;
		int f = 0;
		int b = 0;
		
		while( c < 8 ) {
			
			b = f + s;
			f = s;
			s = b;
			c++;
			System.out.println(b);
		}
		
		/*
		 *  Exercicio 2
		 */
		
		double[][] notas = new double[6][2];
		System.out.println("Digite a notas dos 6 alunos, em ordem (primeiro aluno: primeira nota depois segunda nota)");
		for(int i = 0; i <6; i++) {
			for(int j = 0; i <2; i++) {
				notas[i][j] = scan.nextDouble();
			}
		}
		
		for(int i = 0; i < 6; i++) {
			double m = (notas[i][0] + notas[i][1]) / 2;
			notas[i][2] = m;
			System.out.println(notas[i][2]);
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(notas[i][2] >= 6 ? "Aluno "+(i)+" Passou" : "Aluno "+(i)+" Recuperação");
		}
		
		int a = 0;
		
		for(int i = 0; i < 6; i++) {
			if(notas[i][2] >= 6) {
				a++;
			}
		}
		System.out.println(a+" Alunos passaram");
		
		int d = 0;
		
		for(int i = 0; i < 6; i++) {
			if(notas[i][2] <= 3) {
				d++;
			}
		}
		System.out.println(d+" Alunos reprovaram");
		
		int e = 0;
		
		for(int i = 0; i < 6; i++) {
			if((notas[i][2] <= 6)||(notas[i][2] >= 3)) {
				e++;
			}
		}
		System.out.println(e+" Alunos de recuperação");
		
		double g = 0;
		
		for(int i = 0; i < 6; i++) {
			g = g + notas[i][2];
		}
		System.out.println("Media da sala: "+g/6);
		
		/*
		 *  Exercicio 3
		 */
		
		boolean prime = true;
		System.out.println("Insira o numero que desejas saber se é primo ou não (inteiro positivo) ");
		int h = scan.nextInt();
		for(int i = 2; i <= h; i ++) {
			if( (h % i == 0) && (i != h) ) {
				prime = false;
				break;
			}
		}
		if(prime)
			System.out.print("O numero "+h+" é primo");
		else
			System.out.print("O numero "+h+" não é primo");
		
		/*
		 *  Exercicio 4
		 */
		
		System.out.println("Insira notas dos alunos (Ordem: Primeira nota, segunda nota, presença)");
		int[][] Sala = new int[5][3];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				Sala[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < 5; i++) {
			if((Sala[i][0] + Sala[i][1] >= 6) && (Sala[i][2] / 18 >= 0.75)){
				System.out.println("Aluno "+i+" aprovado");
			}
			else
				System.out.println("Aluno "+i+" reprovado");
		}
		
		/*
		 *  Exercicio 5
		 */
		
		int[] first = {1,2,3,4,5,};
		int[] second = {10,9,8,7,6,5,4,3,2,1,};
		int[][] third = {{1,2,3,},
					     {4,5,6},
					     {7,8,9},
					     {10,11,12}};
		int[][] fourth = new int[4][3]; 
		int m = 0;
		//If they were random numbers, would i need to use the lowest integer? or just be clever
		int n = 1;
		
		for(int i = 0; i < first.length; i++) {
			if(first[i] > m)
				m = first[i];
		}
		
		for(int i = 0; i < second.length; i++) {
			if(second[i] < n)
				n = second[i];
		}
		
		int x = n*m;
		int k = 0;
		int l = 0;
		int o = 0;
		int p = 0;
		
		for(int i = 0; i < 4; i ++) {
			for(int j = 0; j < 3; j++) {
				fourth[i][j] = third[i][j] + x;
			
				if(fourth[0][j] % 2 == 0) {
					k += fourth[0][j]; 
				}
				if(fourth[1][j] % 2 == 0) {
					l += fourth[1][j];
				}	
				if(fourth[0][j] % 2 == 0) {
					o += fourth[2][j];
				}
				if(fourth[3][j] % 2 == 0) {
					p += fourth[3][j];
				}
			}
		}
		
		/*
		 *  Exercicio 6
		 */
		
		boolean[][] assentos = new boolean[2][5];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				assentos[i][j] = false;
			}
		}
		
		
		
		
		scan.close();
	}

}

