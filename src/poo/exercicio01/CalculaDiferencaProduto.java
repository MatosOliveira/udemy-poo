/**
 * 
 */
package poo.exercicio01;

import java.util.Scanner;

/**
 * Classe que le quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 * 
 * @author Matos - 26.04.2023
 *
 */
public class CalculaDiferencaProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println("DIFERENCA = " + ((a * b) - (c * d)));
		
		sc.close();

	}

}
