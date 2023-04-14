package Variaveis_e_Operadores;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		String nome;
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do(a) participante: ");
		nome = leia.next();
		
		System.out.println("Digite a primeira nota do participante: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota do participante: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota do participante: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota do participante: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média final do(a) participante " + nome + " é: " + media);
	}
}