package lista02;

import java.util.Scanner;

public class exercicio06 {
	/*
	 * Em uma eleição presidencial existem quatro candidatos. Os votos são
	 * informados através de códigos. Os dados utilizados para a contagem dos votos
	 * obedecem à seguinte codificação: 1,2,3,4 = voto para os respectivos
	 * candidatos; 5 = voto nulo; 6 = voto em branco; Escreva um programa que leia
	 * uma sequência de números representando os votos, calcule e escreva: • total
	 * de votos para cada candidato; • total de votos nulos; • total de votos em
	 * branco. Como finalizador do conjunto de votos, tem-se o valor 0.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaracao de variáveis
		int voto = 0, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0, branco = 0;

		do {
			// Entrada de dados
			System.out.print("Digite o seu voto:");
			voto = sc.nextInt();

			// Processamento. Contagem de votos.
			switch (voto) {
			case 1:
				candidato1++;
				break;
			case 2:
				candidato2++;
				break;
			case 3:
				candidato3++;
				break;
			case 4:
				candidato4++;
				break;
			case 5:
				nulo++;
				break;
			case 6:
				branco++;
				break;
			default:
				System.out.println("Opção de voto inválida.");
				break;
			}
		} while (voto != 0);// O "do" irá se repetir até que o usuário digitar o 0.

		// Saída de dados
		System.out.println("Total de votos por candidato:" + "\nCandidato 1: " + candidato1 + "\nCandidato 2: "
				+ candidato2 + "\nCandidato 3: " + candidato3 + "\nCandidato 4: " + candidato4
				+ "\nTotal de votos nulos: " + nulo + "\nTotal de votos em branco: " + branco);
		sc.close();
	}
}
