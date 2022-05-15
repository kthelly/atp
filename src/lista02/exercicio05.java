package lista02;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * A secretaria de saúde de uma cidade fez uma pesquisa entre seus habitantes,
		 * coletando dados sobre a idade e a quantidade de filhos de cada habitante. A
		 * secretaria deseja saber: média da idade da população; média do número de
		 * filhos; maior idade; percentual de pessoas acima de 60 anos. O final da
		 * leitura de dados se dará com a entrada de uma idade negativa.
		 */
		// Declaração de variáveis
		int idade = 0, numFilho;
		int numPessoas = 0, num18 = 0, num60 = 0;
		float somaIdade = 0, somaFilho = 0, mediaIdade, mediaFilhos, percentual = 0;

		do {
			// Entrada e processamento de dados
			System.out.println("Qual a sua idade?");
			idade = sc.nextInt();

			// Processamento. Verificação da idade e cálculo de média
			if (idade > 0) {

				System.out.println("Quantos filhos você tem?");
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
		} while (idade >= 0); // Repetir até que o usuário digite uma idade negativa

		System.out.println("A média da idade da população é: " + mediaIdade + "\nA média do número de filhos: "
				+ mediaFilhos + "\nNúmero de pessoas com maior idadde: " + num18
				+ "\nO percentual de pessoas acima de 60 anos: " + percentual);
		sc.close();
	}
}
