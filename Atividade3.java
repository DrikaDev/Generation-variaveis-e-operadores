/*
Elabore um algoritmo em Java, que leia o Salário Bruto, 
o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador, 
em variáveis do tipo float e exiba na tela o Salário Líquido.
SALÁRIO LÍQUIDO = SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS
*/

package Variaveis_e_Operadores;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário bruto R$ ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno R$ ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor das horas extras R$ ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos R$ ");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalNoturno) + (horasExtras * 5) - descontos;
		System.out.println("Valor do salario líquido R$" + salarioLiquido);
	}
}
