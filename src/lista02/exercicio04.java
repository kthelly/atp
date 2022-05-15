package lista02;

import java.util.Scanner;

public class exercicio04 {

	/*
	 * Faça um programa para calcular o k-ésimo dígito da direita para a esquerda de
	 * um número n. Suponha que k é menor ou igual ao número de dígitos de n.
	 * Exemplo: o 3o dígito de 1984 é 9. Você deve, obrigatoriamente, usar um número
	 * inteiro.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, quociente, digito, resto, divisao = 0;

		// Entrada de dados
		System.out.println("Digite o número e o digito a ser verificado:");
		num = sc.nextInt();
		digito = sc.nextInt();
		quociente = num;
		// Processamento de dados
		while (quociente != 0) {
			divisao++;
			resto = num % 10;
			if (divisao == digito) {
				// Saída de dados. Quando a divisão (quantidade de vezes digitada) for igual ao
				// digito imprimir o resto desta divisão.
				System.out.println("O digito é: " + resto);
			}
			quociente = num / 10;
			num = quociente;
		}
		sc.close();
	}
}
