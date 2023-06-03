/**
 * 
 */
package poo.exercicio02;

import java.util.Scanner;

/**
 * Classe le um número inteiro, e depois dizer se este número é negativo ou não.
 * 
 * @author Matos - 04.05.2023
 *
 */
public class VerificaNumeroNegativo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();

	}

}
