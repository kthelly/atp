package primeiraLista;

import java.util.Scanner;

public class Exercicio03 {
	/*
	 * Fa�a um programa para ler dois valores num�ricos e apresentar a diferen�a do
	 * maior pelo menor.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1, num2, dif;
		
		System.out.println("Digite 2 numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			dif = num1 - num2;
			System.out.println("A diferen�a entre o maior n�mero e o menor � " + dif);
		} else {
			dif = num2 - num1;
			System.out.println("A diferen�a entre o maior n�mero e o menor � " + dif);
		}
	}

}
