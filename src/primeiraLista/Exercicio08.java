package primeiraLista;

import java.util.Scanner;

public class Exercicio08 {

	/*
	 * Faça um programa para ler e imprimir três números. Se o primeiro for
	 * positivo, imprimir sua raiz quadrada, caso contrário, imprimir o seu
	 * quadrado; se o segundo número for maior que 10 e menor que 100, imprimir a
	 * mensagem: “Número entre 10 e 100. Intervalo permitido”; se o terceiro número
	 * for menor que o segundo, calcular e imprimir a diferença entre eles, caso
	 * contrário, calcular e imprimir a soma entre eles.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0, num2, num3;
		
		System.out.println("Digite 3 numeros: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		
		System.out.println("Os numeros digitados são: " + num1 + ", " + num2 + " e " + num3);
		if (num1 > 0) {
			System.out.println("A raiz quadrado do primeiro número é: " + Math.sqrt(num1));
		} else {
			System.out.println("O quadrado do 1º número é: " + (num1 * num1));
		}
		
		if (num2 > 10 && num2 < 100) {
			System.out.println("Número 2 entre 10 e 100. Intervalo permitido");
		}
		
		if (num3 < num2) {
			System.out.println("A diferença entre o primeiro e o segundo número é: " + (num2 - num3));
		} else {
			System.out.println("A soma entre o primeiro e o segundo número é: " + (num2 + num3));
		}
	}

}
