package lista02;

import java.util.Scanner;

public class exercicio08b {
	/*
	 * Escreva programas para calcular os seguintes somat�rios ou s�ries: H = 1 +
	 * (2/3) + (3/5) + (4/7) + ... + (50/99)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float soma = 0;

		/*
		 * Processamento. Repeti��o do denominador e soma de s�rie. Numerador aumenta de
		 * 1 2m 1 e denominanor s� os impares
		 */
		for (float i = 1, j = 1; i <= 50; i++, j += 2) {
			soma = soma + (i / j);
		}

		// Sa�da de dados.
		System.out.println("O valor do somatorio da s�rie �: " + soma);
		sc.close();
	}

}
