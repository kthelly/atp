package lista01;

import java.util.Scanner;

public class Exercicio15 {

	/*
	 * Fa�a um programa que l� 3 valores a, b, c e calcula e escreve a m�dia
	 * ponderada com pesos de 5 para o maior dos 3 valores e 2.5 para os outros dois
	 * valores.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, maior, menor, meio, mediaP;

		System.out.println("Digite 3 n�meros a, b e c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if (a == b && a == c) {
			mediaP = ((a * 5) + (b * 5) + (c * 5)) / 15;
			System.out.println(
					"Os n�meros s�o iguais e tem valor igual a: " + a +
					"\nA m�dia ponderada dos n�meros �: " + mediaP); 
		} else {
			maior = a > b ? a : b;
			maior = maior > c ? maior : c;
			menor = a < b ? a : b;
			menor = menor < c ? menor : c;
			//meio = 			
			//mediaP = ((maior * 5) + (meio * 2.5) + (menor * 2.5)) / 10;
			//System.out.println("O maior n�mero entre eles �: " + maior + "\nO n�mero intermedi�rio entre eles �: " + meio
					//+ "\nO nemor n�mero entre eles �: " + menor + "\nA m�dia ponderada dos n�meros �: " + mediaP);
		}

		

	}
}
