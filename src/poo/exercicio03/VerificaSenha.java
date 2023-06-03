/**
 * 
 */
package poo.exercicio03;

import java.util.Scanner;

/**
 * Classe que repite a leitura de uma senha até que ela seja válida. 
 * 
 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
 * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
 * 
 * Considere que a senha correta é o valor 2002.
 * 
 * @author Matos - 06.05.2023
 *
 */
public class VerificaSenha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int senha = sc.nextInt();
			
			while(senha != 2002) {
				System.out.println("Senha invalida");
				senha = sc.nextInt();
			}
		}
		
		System.out.println("Acesso permitido");

	}

}
