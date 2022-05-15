package lista02;

import java.util.Scanner;

public class exercicio04 {

	/*
	 * Fa�a um programa para calcular o k-�simo d�gito da direita para a esquerda de
	 * um n�mero n. Suponha que k � menor ou igual ao n�mero de d�gitos de n.
	 * Exemplo: o 3o d�gito de 1984 � 9. Voc� deve, obrigatoriamente, usar um n�mero
	 * inteiro.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, quociente, digito, resto, divisao = 0;

		// Entrada de dados
		System.out.println("Digite o n�mero e o digito a ser verificado:");
		num = sc.nextInt();
		digito = sc.nextInt();
		quociente = num;
		// Processamento de dados
		while (quociente != 0) {
			divisao++;
			resto = num % 10;
			if (divisao == digito) {
				// Sa�da de dados. Quando a divis�o (quantidade de vezes digitada) for igual ao
				// digito imprimir o resto desta divis�o.
				System.out.println("O digito �: " + resto);
			}
			quociente = num / 10;
			num = quociente;
		}
		sc.close();
	}
}
