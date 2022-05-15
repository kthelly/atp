package lista02;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaracao de variáveis
		int codigo, totalAulas, totalFaltas;

		// notaSemestre (0 a 70 pontos), notaPfinal (30 pontos) e notaEespecial (30
		// pontos).
		double notaSemestre, notaPfinal, notaTotal, notaEespecial, notaTotalesp, frequencia;

		// Entrada de dados.
		System.out.println("Digite o código da matéria:");
		codigo = sc.nextInt();

		System.out.println("Digite o total de aulas do semestre:");
		totalAulas = sc.nextInt();

		System.out.println("Digite o total de faltas do aluno no decorrer do semestre:");
		totalFaltas = sc.nextInt();

		frequencia = 1.0 - (double) totalFaltas / (double) totalAulas;

		// CONDIÇÕES: O semestre vale 100 pontos, e a média para aprovação é 60 pontos
		if (frequencia >= 0.75) { // O aluno deve obter pelo menos 75% de frequência
			System.out.println("Digite a nota alcançada pelo aluno durante o semestre:");
			notaSemestre = sc.nextDouble();

			if (notaSemestre >= 30) { // O aluno deve alcançar pelo menos 30 pontos no semestre para poder ir para a
										// prova final.
				System.out.println("Digite a nota da prova final:");
				notaPfinal = sc.nextDouble();
				notaTotal = notaSemestre + notaPfinal;

				/*
				 * A nota do semeste + prova final deve ser superior ou igual a 60 pontos. Caso
				 * o aluno não obtenha a média com a prova final, o aluno fará um exame especial
				 * que substituirá a prova final.
				 */
				if (notaTotal < 60) {
					System.out.println("Digite a nota do exame especial:");
					notaEespecial = sc.nextDouble();
					notaTotalesp = notaEespecial + notaSemestre;
					if (notaTotalesp >= 60) { // A nota do semeste + exame especial deve ser superior a 60 pontos.
						System.out.println("O aluno foi aprovado na disciplina " + codigo + " com a nota final de: "
								+ notaTotalesp);
					} else {
						System.out.println("O aluno foi reprovado na disciplina " + codigo + " por nota.");
					}
				} else {
					System.out.println(
							"O aluno foi aprovado na disciplina " + codigo + " com a nota final de: " + notaTotal);
				}
			} else {
				System.out.println("O aluno foi reprovado na disciplina " + codigo + " por nota.");
			}
		} else {
			System.out.println("O aluno foi reprovado na disciplina " + codigo + " por infrequência.");
		}
		sc.close();
	}

	}


