package lista01;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * Faça um programa que receba dois números e mostre o maior.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Digite 2 numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Numeros iguais");
			return;
		}
		
		if (num1 > num2)
			System.out.println("O numero " + num1 + " é o maior entre eles");
		else {
			System.out.println("O numero " + num2 + " é o maior entre eles");
		}

		sc.close();
	}

}
