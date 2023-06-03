/**
 * 
 */
package poo.exercicio01;

import java.util.Scanner;

/**
 * Classe que le dois valores inteiros, e depois mostrar na tela a soma desses números com uma
 * mensagem explicativa
 * 
 * @author Matos - 26.04.2023
 *
 */
public class CalculaSoma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("SOMA = " + (num1 + num2));
		
		sc.close();

	}

}
