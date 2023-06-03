/**
 * 
 */
package poo.exercicio04;

import java.util.Scanner;

/**
 * Classe que le um número inteiro N e calcular todos os seus divisores.
 * 
 * @author Matos - 07.05.2023
 *
 */
public class CalculaDivisores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
