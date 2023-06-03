/**
 * 
 */
package poo.exercicio04;

import java.util.Scanner;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * 
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 * 
 * @author Matos - 07.05.2023
 *
 */
public class VerificaIntervaloNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int valor;
			int qtdeIn = 0;
			int qtdeout = 0;
			
			for(int i = 0; i < n; i++) {
				
				valor = sc.nextInt();
				
				if(valor >= 10 && valor <= 20) {
					qtdeIn += 1;
					
				} else {
					qtdeout += 1;
				}
				
			}
			
			sc.close();
			
			System.out.println(qtdeIn + " in ");
			System.out.println(qtdeout + " out ");
		}

	}

}
