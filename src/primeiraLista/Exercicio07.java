package primeiraLista;

import java.util.Scanner;

public class Exercicio07 {

	/*
	 * Faça um programa que receba dois números e execute uma das operações listadas
	 * a seguir de acordo com a escolha do usuário. 1 Média entre os números
	 * digitados 2 Diferença do maior para o menor 3 Produto entre os números
	 * digitados 4 Divisão do primeiro pelo segundo
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, maior;
		int opcao;

		System.out.println("Digite 2 numeros: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.println("Digite: \n" + "1 para- Média entre os números digitados;\n"
				+ "2 para- Diferença do maior para o menor;\n" + "3 para- Produto entre os números digitados;\n"
				+ "4 para- Divisão do primeiro pelo segundo;\n");
		opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("A média entre os números digitados é " + (num1 + num2) / 2);
			break;
		case 2:
			if (num1 > num2) {
				System.out.println("A diferença do maior para o menor é " + (num1 - num2));
			} else {
				System.out.println("A diferença do maior para o menor é " + (num2 - num1));
			}
			break;
		case 3:
			System.out.println("O produto entre os números digitados " + num1 * num2);
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("Não é possivel realizar a divisão por zero");
			} else {
				System.out.println("A divisão do primeiro pelo segundo é " + num1 / num2);
			}
			break;
		}
	}
}
