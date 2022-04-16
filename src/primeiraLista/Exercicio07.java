package primeiraLista;

import java.util.Scanner;

public class Exercicio07 {

	/*
	 * Fa�a um programa que receba dois n�meros e execute uma das opera��es listadas
	 * a seguir de acordo com a escolha do usu�rio. 1 M�dia entre os n�meros
	 * digitados 2 Diferen�a do maior para o menor 3 Produto entre os n�meros
	 * digitados 4 Divis�o do primeiro pelo segundo
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, maior;
		int opcao;

		System.out.println("Digite 2 numeros: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.println("Digite: \n" + "1 para- M�dia entre os n�meros digitados;\n"
				+ "2 para- Diferen�a do maior para o menor;\n" + "3 para- Produto entre os n�meros digitados;\n"
				+ "4 para- Divis�o do primeiro pelo segundo;\n");
		opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("A m�dia entre os n�meros digitados � " + (num1 + num2) / 2);
			break;
		case 2:
			if (num1 > num2) {
				System.out.println("A diferen�a do maior para o menor � " + (num1 - num2));
			} else {
				System.out.println("A diferen�a do maior para o menor � " + (num2 - num1));
			}
			break;
		case 3:
			System.out.println("O produto entre os n�meros digitados " + num1 * num2);
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("N�o � possivel realizar a divis�o por zero");
			} else {
				System.out.println("A divis�o do primeiro pelo segundo � " + num1 / num2);
			}
			break;
		}
	}
}
