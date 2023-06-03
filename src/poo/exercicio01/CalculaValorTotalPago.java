/**
 * 
 */
package poo.exercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le:
 * - o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1; 
 * - o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2;
 * Calcula e exibe o valor a ser pago.
 *
 * @author Matos
 *
 */
public class CalculaValorTotalPago {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codPecas1 = sc.nextInt();
		int qtdePecas1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();
		
		int codPecas2 = sc.nextInt();
		int qtdePecas2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valorPagoPeca1 = qtdePecas1 * valorUnitarioPeca1;
		double valorPagoPeca2 = qtdePecas2 * valorUnitarioPeca2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", (valorPagoPeca1 + valorPagoPeca2));
		
		sc.close();

	}

}
