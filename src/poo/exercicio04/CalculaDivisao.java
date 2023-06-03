/**
 * 
 */
package poo.exercicio04;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le um número N. 
 * 
 * Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. 
 * 
 * Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 * 
 * @author Matos - 07.05.2023
 *
 */
public class CalculaDivisao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double valor1, valor2;
		double resultado = 0.0;
		
		for(int i = 0; i < n; i++) {
			
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			
			if(valor2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				resultado = valor1 / valor2; 
				System.out.printf("%.1f%n", resultado);
			}
			
		}
		
		sc.close();

	}

}
