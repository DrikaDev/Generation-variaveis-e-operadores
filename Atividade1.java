/*
Dado o Fluxograma, desenvolva o algoritmo abaixo na Linguagem Java.
As variáveis devem ser do tipo float.
*/

package Variaveis_e_Operadores;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário R$ ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do abono R$ ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.println("Valor do novo salário R$ " + novoSalario);
	}
}