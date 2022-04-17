package lista01;

import java.util.Scanner;

public class Exercicio15 {

	/*
	 * Faça um programa que lê 3 valores a, b, c e calcula e escreve a média
	 * ponderada com pesos de 5 para o maior dos 3 valores e 2.5 para os outros dois
	 * valores.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, maior, menor, meio, mediaP;

		System.out.println("Digite 3 números a, b e c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if (a == b && a == c) {
			mediaP = ((a * 5) + (b * 5) + (c * 5)) / 15;
			System.out.println(
					"Os números são iguais e tem valor igual a: " + a +
					"\nA média ponderada dos números é: " + mediaP); 
		} else {
			maior = a > b ? a : b;
			maior = maior > c ? maior : c;
			menor = a < b ? a : b;
			menor = menor < c ? menor : c;
			//meio = 			
			//mediaP = ((maior * 5) + (meio * 2.5) + (menor * 2.5)) / 10;
			//System.out.println("O maior número entre eles é: " + maior + "\nO número intermediário entre eles é: " + meio
					//+ "\nO nemor número entre eles é: " + menor + "\nA média ponderada dos números é: " + mediaP);
		}

		

	}
}
