/**
 * 
 */
package poo.exercicio02;

import java.util.Scanner;

/**
 * Classe le um número inteiro, e depois dizer se este número é par ou ímpar.
 * 
 * @author Matos - 04.05.2023
 *
 */
public class VerificaNumeroParImpar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
