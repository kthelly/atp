package lista01;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * Fa�a um programa que receba dois n�meros e mostre o maior.
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
			System.out.println("O numero " + num1 + " � o maior entre eles");
		else {
			System.out.println("O numero " + num2 + " � o maior entre eles");
		}

		sc.close();
	}

}
