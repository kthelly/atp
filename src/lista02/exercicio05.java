package lista02;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * A secretaria de sa�de de uma cidade fez uma pesquisa entre seus habitantes,
		 * coletando dados sobre a idade e a quantidade de filhos de cada habitante. A
		 * secretaria deseja saber: m�dia da idade da popula��o; m�dia do n�mero de
		 * filhos; maior idade; percentual de pessoas acima de 60 anos. O final da
		 * leitura de dados se dar� com a entrada de uma idade negativa.
		 */
		// Declara��o de vari�veis
		int idade = 0, numFilho;
		int numPessoas = 0, num18 = 0, num60 = 0;
		float somaIdade = 0, somaFilho = 0, mediaIdade, mediaFilhos, percentual = 0;

		do {
			// Entrada e processamento de dados
			System.out.println("Qual a sua idade?");
			idade = sc.nextInt();

			// Processamento. Verifica��o da idade e c�lculo de m�dia
			if (idade > 0) {

				System.out.println("Quantos filhos voc� tem?");
				numFilho = sc.nextInt();

				somaIdade = idade + somaIdade;
				somaFilho = numFilho + somaFilho;
				numPessoas++;

				if (idade >= 60) {
					num60++;
				}

				if (idade > 18) {
					num18++;
				}
			}

			mediaIdade = (float) somaIdade / numPessoas;
			mediaFilhos = (float) somaFilho / numPessoas;
			percentual = ((float) num60 / (float) numPessoas) * 100;
		} while (idade >= 0); // Repetir at� que o usu�rio digite uma idade negativa

		System.out.println("A m�dia da idade da popula��o �: " + mediaIdade + "\nA m�dia do n�mero de filhos: "
				+ mediaFilhos + "\nN�mero de pessoas com maior idadde: " + num18
				+ "\nO percentual de pessoas acima de 60 anos: " + percentual);
		sc.close();
	}
}
