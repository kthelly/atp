package lista01;

import java.util.Scanner;

public class Exercicio14 {

	/*
	 * Faça um programa para ler três valores a, b, e c, quaisquer e escrever o maior dos 3.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, maior;
		
		System.out.println("Digite 3 números a, b e c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		maior = a > b ? a : b;
		maior = maior > c ? maior : c;
		
		System.out.println("O maior número entre eles é: " + maior);
	}

}
