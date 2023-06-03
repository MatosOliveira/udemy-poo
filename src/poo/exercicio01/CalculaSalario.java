/**
 * 
 */
package poo.exercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
 * hora e calcula o salário desse funcionário. 
 * 
 * Exibir o número e o salário do funcionário, com duas casas decimais.
 * 
 * @author Matos - 27.04.2023
 *
 */
public class CalculaSalario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numFuncional = sc.nextInt();
		int qtdeHorasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = qtdeHorasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER: " + numFuncional 
				+ "\nSALARY: U$ %.2f%n", salario);
		
		sc.close();
		
		

	}

}
