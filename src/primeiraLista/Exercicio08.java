package primeiraLista;

import java.util.Scanner;

public class Exercicio08 {

	/*
	 * Fa�a um programa para ler e imprimir tr�s n�meros. Se o primeiro for
	 * positivo, imprimir sua raiz quadrada, caso contr�rio, imprimir o seu
	 * quadrado; se o segundo n�mero for maior que 10 e menor que 100, imprimir a
	 * mensagem: �N�mero entre 10 e 100. Intervalo permitido�; se o terceiro n�mero
	 * for menor que o segundo, calcular e imprimir a diferen�a entre eles, caso
	 * contr�rio, calcular e imprimir a soma entre eles.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0, num2, num3;
		
		System.out.println("Digite 3 numeros: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		
		System.out.println("Os numeros digitados s�o: " + num1 + ", " + num2 + " e " + num3);
		if (num1 > 0) {
			System.out.println("A raiz quadrado do primeiro n�mero �: " + Math.sqrt(num1));
		} else {
			System.out.println("O quadrado do 1� n�mero �: " + (num1 * num1));
		}
		
		if (num2 > 10 && num2 < 100) {
			System.out.println("N�mero 2 entre 10 e 100. Intervalo permitido");
		}
		
		if (num3 < num2) {
			System.out.println("A diferen�a entre o primeiro e o segundo n�mero �: " + (num2 - num3));
		} else {
			System.out.println("A soma entre o primeiro e o segundo n�mero �: " + (num2 + num3));
		}
	}

}
