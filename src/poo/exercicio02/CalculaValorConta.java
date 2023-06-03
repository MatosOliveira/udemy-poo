/**
 * 
 */
package poo.exercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe le o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * Exemplos:
 * 
 * 
 * 
 * @author Matos - 04.05.2023
 *
 */
public class CalculaValorConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoItem = sc.nextInt();
		int qtdeItem = sc.nextInt();
		double total = 0.0;

		switch (codigoItem) {
		case 1: {
			total = qtdeItem * 4.00;
			break;
		} case 2: {
			total = qtdeItem * 4.50;
			break;
		} case 3: {
			total = qtdeItem * 5.00;
			break;
		} case 4: {
			total = qtdeItem * 2.00;
			break;
		} default:
			total = qtdeItem * 1.50;
		}

		System.out.printf("Total: %.2f%n", total);
		
		sc.close();

	}

}
