/**
 * 
 */
package poo.exercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le três valores com ponto flutuante de dupla precisão: A, B e C. 
 * 
 * Calcula e exibe:
 * a) a área do triângulo retângulo que tem A por base e C por altura;
 * b) a área do círculo de raio C. (pi = 3.14159);
 * c) a área do trapézio que tem A e B por bases e C por altura;
 * d) a área do quadrado que tem lado B;
 * e) a área do retângulo que tem lados A e B.
 * 
 * @author Matos - 26.04.2023
 *
 */
public class CalculaArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		//Triangulo
		System.out.printf("TRIANGULO: %.3f%n", ((a * c) / 2));
		
		//Circulo
		System.out.printf("CIRCULO: %.3f%n", (Math.PI * Math.pow(c, 2)));

		//Trapezio
		System.out.printf("TRAPEZIO: %.3f%n", ((a + b) * c) / 2);
		
		//Quadrado
		System.out.printf("QUADRADO: %.3f%n", (Math.pow(b, 2)));
		
		//Retangulo
		System.out.printf("RETANGULO: %.3f%n", (a * b));
		
		sc.close();
		
	}

}
