package listaVetores;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		int numeros[] = new int[8];
		int iPos = 0, iNeg = 0;
		int positivos[] = new int[iPos];
		int negativos[] = new int[iNeg];
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 8 números inteiros: ");
		
		for (int i = 0; i < numeros.length; i++) { // use length em vez de um valor fixo, assim vc pega o tamanho do
													// array
			System.out.print("-> ");
			numeros[i] = sc.nextInt();
			if (numeros[i] >= 0) {
				positivos[iPos] = numeros[i];
				iPos++;
			} else {
				negativos[iNeg] = numeros[i];
				iNeg++;
			}
		}

		// mostrando os números
		System.out.printf("foram encontrados %d números positivos\n", iPos);
		for (int i = 0; i < iPos; i++) {
			System.out.println(positivos[i]);
		}
		System.out.printf("foram encontrados %d números negativos\n", iNeg);
		for (int i = 0; i < iNeg; i++) {
			System.out.println(negativos[i]);
		}

	}
}
