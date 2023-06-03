/**
 * 
 */
package poo.exercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos
 * ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
 * 
 * Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 * 
 * @author Matos - 04.05.2023
 *
 */
public class VerificaIntervalos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		if ((numero >= 0.00) && (numero <= 25.00)) {
			System.out.println("Intervalo [0,25]");
			
		} else if ((numero > 25.00) && (numero <= 50.00)){
			System.out.println("Intervalo [25,50]");
			
		} else if ((numero >= 50.00) && (numero <= 75.00)){
			System.out.println("Intervalo [50,75]");
			
		} else if ((numero > 75.00) && (numero <= 100.00)){
			System.out.println("Intervalo [75,100]");
			
		} else {
			System.out.println("Fora do Intervalo!");
		}
		
		sc.close();

	}

}
