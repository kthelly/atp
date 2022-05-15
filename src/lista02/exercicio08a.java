package lista02;

import java.util.Scanner;

public class exercicio08a {
	/*
	 * Escreva programas para calcular os seguintes somatórios ou séries:
	 * H = 1 + (1/2) + (1/3) + ... + (1/N) (Obs: N deverá ser lido)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num, soma = 0;

		// Entrada de dados
		System.out.println("Digite N:");
		num = sc.nextInt();
		
		//Processamento. Repetição do denominador e soma de série. 
		for (int i = 1; i <= num; i++) {
			soma = soma + (1 /(float) i);
		}
		
		//Saída de dados. 
		System.out.println("O valor do somatorio da série é: " + soma);
		sc.close();
	}

}
