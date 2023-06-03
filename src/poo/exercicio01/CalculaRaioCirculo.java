/**
 * 
 */
package poo.exercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le o valor do raio de um círculo, e depois mostrar o valor da área deste círculo 
 * com quatro casas decimais
 * 
 * @author Matos - 26.04.2023
 *
 */
public class CalculaRaioCirculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //utilizar (.) ex: 2.00
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double areaCirculo = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", + areaCirculo);
		
		sc.close();

	}

}
