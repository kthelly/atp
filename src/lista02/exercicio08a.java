package lista02;

import java.util.Scanner;

public class exercicio08a {
	/*
	 * Escreva programas para calcular os seguintes somat�rios ou s�ries:
	 * H = 1 + (1/2) + (1/3) + ... + (1/N) (Obs: N dever� ser lido)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num, soma = 0;

		// Entrada de dados
		System.out.println("Digite N:");
		num = sc.nextInt();
		
		//Processamento. Repeti��o do denominador e soma de s�rie. 
		for (int i = 1; i <= num; i++) {
			soma = soma + (1 /(float) i);
		}
		
		//Sa�da de dados. 
		System.out.println("O valor do somatorio da s�rie �: " + soma);
		sc.close();
	}

}
