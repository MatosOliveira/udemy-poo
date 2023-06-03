/**
 * 
 */
package poo.exercicio04;

import java.util.Scanner;

/**
 * Classe que le um valor N, calcula e escreve seu respectivo fatorial. 
 * 
 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.
 * 
 * @author Matos - 07.05.2023
 *
 */
public class ImprimeFatorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		long fatorial = 1;
		
		for(int n = 1; n <= x; n++) {
			fatorial *= n;
		}
		
		System.out.println(fatorial);
		sc.close();

	}

}
