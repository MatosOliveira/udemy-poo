/**
 * 
 */
package poo.exercicio04;

import java.util.Scanner;

/**
 * Classe que le um número inteiro positivo N. 
 * 
 * O programa deve então mostrar na tela N linhas, começando de 1 até N. 
 * 
 * Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.
 * 
 * @author Matos - 07.05.2023
 *
 */
public class CalculaQuadradoCubo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.print(i + " " + (i * i) + " " + (i * i * i) +"\n");
		}
		
		sc.close();

	}

}
