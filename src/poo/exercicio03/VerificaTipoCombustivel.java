/**
 * 
 */
package poo.exercicio03;

import java.util.Scanner;

/**
 * Classe que determina o tipo de combustível abastecido codificado da seguinte forma: 
 * 1.Álcool 
 * 2.Gasolina 
 * 3.Diesel
 * 4.Fim 
 * 
 * Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
 * 
 * O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" 
 * e a quantidade de clientes que abasteceram cada tipo de combustível.
 * 
 * @author Matos - 07.05.2023
 *
 */
public class VerificaTipoCombustivel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int opcao = sc.nextInt();
			int qtdeAlcool = 0;
			int qtdeGasolina = 0;
			int qtdeDiesel = 0;
			
			while (opcao != 4) {
				
				if(opcao < 1 || opcao > 4) {
					System.out.print("Opcao Invalida! Digite outro codigo: ");
					opcao = sc.nextInt();	
				} 
				
				if(opcao == 1) {
					qtdeAlcool += 1;
					
				} else if(opcao == 2) {
					qtdeGasolina += 1;
					
				} else {
					qtdeDiesel += 1; 
				}
				
				opcao = sc.nextInt();
			}

			System.out.println("MUITO OBRIGADO! " 
					+ "\nAlcool: " + qtdeAlcool
					+ "\nGasolina: " + qtdeGasolina
					+ "\nDiesel: " + qtdeDiesel);
		}
	}

}
