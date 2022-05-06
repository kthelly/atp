package lista02;

import java.util.Scanner;

public class exercicio02 {
	// Coordenadas do plano cartesiano
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaração de variáveis
		float x = 1, y = 1;

		// Quantidade indeterminada de pontos no sistema cartesiano
		while (x != 0 && y != 0) {

			// Entrada de dados.
			System.out.println("Digite  a coordenada x do ponto: ");
			x = sc.nextFloat();
			System.out.println("Digite  a coordenada y do ponto: ");
			y = sc.nextFloat();

			// Condições para determinar o quadrante a que os pontos pertencem
			if (x > 0 && y > 0) {
				System.out.println("O ponto (" + x + ", " + y + ") pertence ao primeiro quadrante.");
			} else if (x < 0 && y > 0) {
				System.out.println("O ponto (" + x + ", " + y + ") pertence ao segundo quadrante.");
			} else if (x < 0 && y < 0) {
				System.out.println("O ponto (" + x + ", " + y + ") pertence ao terceiro quadrante.");
			} else if (x > 0 && y < 0) {
				System.out.println("O ponto (" + x + ", " + y + ") pertence ao quarto quadrante.");
			}
		}
		sc.close();
	}
}
