package lista01;

import java.util.Scanner;

public class Exercicio13 {

	/*
	 * Fa�a um programa que l� o n�mero de um vendedor de uma empresa, seu sal�rio
	 * fixo e o total de vendas por ele efetuadas. Cada vendedor recebe um sal�rio
	 * fixo, mais uma comiss�o proporcional �s vendas por ele efetuadas. A comiss�o
	 * � de 3% sobre o total de vendas at� 10.000 e 5% sobre o que ultrapassa este
	 * valor. Escrever o n�mero do vendedor, o total de suas vendas, seu sal�rio
	 * fixo e seu sal�rio total.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numVend, totalVend;
		double salaFix, salarioT;
		
		System.out.println("Vendedor por favor digite seu c�digo de matr�cula: ");
		numVend = sc.nextInt();
		
		System.out.println("Vendedor por favor digite o seu sal�rio fixo: ");
		salaFix = sc.nextDouble();
		
		System.out.println("Vendedor por favor digite a quantidade de vendas do m�s: ");
		totalVend = sc.nextInt();
		
		if (totalVend <= 10000) {
			salarioT = salaFix + (0.03 * totalVend);
			System.out.println("O c�digo do vendedor �: " + numVend 
					+ "\nO tota de vendas efetuadas s�o: " + totalVend
					+ "\nO sal�rio fixo �: " + salaFix 
					+ "\nO seu sal�rio mensal ser� de: " + salarioT);
		} else {
			salarioT = salaFix + (0.03 * 10000) + (0.05 * (totalVend - 10000));
			System.out.println("O c�digo do vendedor �: " + numVend 
					+ "\nO tota de vendas efetuadas s�o: " + totalVend
					+ "\nO sal�rio fixo �: " + salaFix 
					+ "\nO seu sal�rio mensal ser� de: " + salarioT);
		}
	}
}
