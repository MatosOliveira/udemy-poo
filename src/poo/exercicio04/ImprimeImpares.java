/**
 * 
 */
package poo.exercicio04;

import java.util.Scanner;

/**
 * Classe que le um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, 
 * inclusive o X, se for o caso.
 * 
 * @author Matos - 07.05.2023
 *
 */
public class ImprimeImpares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			
			for(int i = 1; i <= x; i++) {
				
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
			
			sc.close();
		}
		

	}

}
