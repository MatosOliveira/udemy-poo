/**
 * 
 */
package poo.exercicio02;

import java.util.Scanner;

/**
 * Classe le a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * 
 * @author Matos - 04.05.2023
 *
 */
public class CalculaDuracaoJogos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hrInicial = sc.nextInt();
		int hrFinal = sc.nextInt();
		int duracao;
		final int DURACAO_MAXIMA = 24;
		final int DURACAO_MINIMA = 1;
		
	
		if (hrInicial < hrFinal) {
			duracao =  hrFinal - hrInicial;
		} else {
			duracao =  (DURACAO_MAXIMA - hrInicial) + hrFinal;
		}
		
		//Verifica se a duracao e de 1h
		if(duracao == DURACAO_MINIMA) {
			System.out.println("O JOGO DUROU " + duracao + " HORA.");
		} else {
			System.out.println("O JOGO DUROU " + duracao + " HORA(S).");
		}
		
		sc.close();

	}

}
