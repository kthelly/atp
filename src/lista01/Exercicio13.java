package lista01;

import java.util.Scanner;

public class Exercicio13 {

	/*
	 * Faça um programa que lê o número de um vendedor de uma empresa, seu salário
	 * fixo e o total de vendas por ele efetuadas. Cada vendedor recebe um salário
	 * fixo, mais uma comissão proporcional às vendas por ele efetuadas. A comissão
	 * é de 3% sobre o total de vendas até 10.000 e 5% sobre o que ultrapassa este
	 * valor. Escrever o número do vendedor, o total de suas vendas, seu salário
	 * fixo e seu salário total.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numVend, totalVend;
		double salaFix, salarioT;
		
		System.out.println("Vendedor por favor digite seu código de matrícula: ");
		numVend = sc.nextInt();
		
		System.out.println("Vendedor por favor digite o seu salário fixo: ");
		salaFix = sc.nextDouble();
		
		System.out.println("Vendedor por favor digite a quantidade de vendas do mês: ");
		totalVend = sc.nextInt();
		
		if (totalVend <= 10000) {
			salarioT = salaFix + (0.03 * totalVend);
			System.out.println("O código do vendedor é: " + numVend 
					+ "\nO tota de vendas efetuadas são: " + totalVend
					+ "\nO salário fixo é: " + salaFix 
					+ "\nO seu salário mensal será de: " + salarioT);
		} else {
			salarioT = salaFix + (0.03 * 10000) + (0.05 * (totalVend - 10000));
			System.out.println("O código do vendedor é: " + numVend 
					+ "\nO tota de vendas efetuadas são: " + totalVend
					+ "\nO salário fixo é: " + salaFix 
					+ "\nO seu salário mensal será de: " + salarioT);
		}
	}
}
