/**
 * 
 */
package poo.exercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le um valor com duas casas decimais, equivalente ao salário de uma
 * pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve
 * pagar de Imposto de Renda, segundo a tabela abaixo.
 * 
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
 * valor deve ser impresso com duas casas decimais.
 * 
 * Exemplo:
 * 
 * Renda Imposto de renda R$ 0,00 a R$2000,00 Isento R$ 2001,00 ate 3000,00 8%
 * R$ 3001,00 ate 4500,00 18% acima de R$ 4500,00 28%
 * 
 * @author Matos - 05.05.2023
 *
 */
public class CalculaValorImpostoRenda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double txImposto = 0.0;

		// Calcula a taxa de imposto
		if ((salario > 2000.01) && (salario <= 3000.0)) {
			txImposto = (salario - 2000.0) * 0.08;

		} else if ((salario > 3000.01) && (salario <= 4500.0)) {
			txImposto = ((salario - 3000) * 0.18) + (1000 * 0.08);

		} else if (salario > 4500.0) {
			txImposto = (((salario - 4500.0) * 0.28) + (1500.0 * 0.18) + (1000 * 0.08));
		}

		// Imprime a saida
		if ((salario > 0.0) && (salario <= 2000.0)) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", txImposto);
		}

		sc.close();

	}

}
