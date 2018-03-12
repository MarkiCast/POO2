package Exercicios;

import java.util.Scanner;

class OperacoesNumeros {

	public int negPos(int i) {
		
		if(i >= 0)
			return 1;
		else
			return 0;
		
	}
	
	public int somaEntre(int n1, int n2) {

		int s = 0;

		if (n1 > n2) {

			for (int m = n1 - 1; m > n2; m--) {

				s = s + m;
			}
		} else
			for (int m = n2 - 1; m > n1; m--) {
				s = s + m;
			}

		return s;
	}

	public int somaDivisão(int a, int b, int c) {

		int s = 0;

		if (b < c) {

			for (; b < c; b++) {

				if (b % a == 0) {

					s = s + b;
				}

			}
		} else
			for (; c < b; c++) {

				if (c % a == 0) {

					s = s + c;
				}

			}

		return s;
	}

	public String horario(int segundos) {

		int s = segundos % 60;
		int ms = segundos / 60;
		int m = ms % 60;
		int h = ms / 60;
		
		return "O horario é: 0"+h+": 0"+m+": 0"+s;

	}
}

public class ExercicioMetodos {
	
	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		
		OperacoesNumeros op = new OperacoesNumeros();
		
		System.out.println("Insira o numero para o primeiro exercicio, Positivo/Negativo");
		System.out.println(op.negPos(scan.nextInt()));
		
		System.out.println("Insira os numeros para o segundo exercicio, soma *entre* inteiros");
		System.out.println(op.somaEntre(scan.nextInt(), scan.nextInt()));
		
		System.out.println("Insira os numeros para o terceiro exercicio, soma entre inteiros divisiveis");
		System.out.println(op.somaDivisão(scan.nextInt(), scan.nextInt(), scan.nextInt()));
		
		System.out.println("Insira o numero para o quarto exercicio, segundos em horas/mins/secs");
		System.out.println(op.horario(scan.nextInt()));
		
		scan.close();
	}
}
