package primeiraLista;

import java.util.Scanner;

public class Exercicio06 {

	/*
	 * Faça um programa que leia dois números N1 e N2, nesta ordem e imprima: 
	 * • PRIMEIRO: se N1 > N2 
	 * • SEGUNDO: se N1 < N2 
	 * • TERCEIRO: se N1 = N2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Digite 2 numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("PRIMEIRO");
		} else if (num1 < num2) {
			System.out.println("SEGUNDO");
		} else if (num1 == num2) {
			System.out.println("TERCEIRO");
		}
	}
}
