package lista02;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Foi feita uma pesquisa do IBOPE para canais de TV. De cada residência foi
		 * fornecido o número do canal em que a TV estava ligada(501 / 555 / 430 / 126).
		 * Faça um algoritmo que: - leia um número indeterminado de dados - o último
		 * dado contém canal igual a 0 (flag). - Calcule e imprima a porcentagem de cada
		 * canal em relação ao número de dados lidos.
		 */
		int canal = 1, canalA = 0, canalB = 0, canalC = 0, canalD = 0;
		float percentA, percentB, percentC, percentD, total;
		// Entrada de dados
		do {
			System.out.print("Digite o canal que vc assiste(501, 555, 430 ou 126): ");
			canal = sc.nextInt();
			// Processamento. Contagem de votos.
			switch (canal) {

			case 501:
				canalA++;
				break;
			case 555:
				canalB++;
				break;
			case 430:
				canalC++;
				break;
			case 126:
				canalD++;
				break;
			default:
				break;
			}
		} while (canal != 0);// O "do" irá se repetir até que o usuário digitar o 0.
		// Saída de dados
		total = (float) canalA + (float) canalB + (float) canalC + (float) canalD;
		percentA = (canalA / total) * 100;
		percentB = (canalB / total) * 100;
		percentC = (canalC / total) * 100;
		percentD = (canalD / total) * 100;
		System.out.println("A porcentagem de cada canal em relação ao número de dados lidos:" + "\n501: " + percentA
				+ "%" + "\n555: " + percentB + "%" + "\n430: " + percentC + "%" + "\n126: " + percentD + "%");
		sc.close();
	}

}
