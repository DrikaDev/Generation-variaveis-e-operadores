package JavaTech;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		String nome = "Adriana";
		int idade = 43, x = 10;
		double altura = 1.59;
		float nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Altura: " + altura);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();

		media = (nota1 + nota2 + nota3) / 3;
		
		//System.out.println("A média do aluno é: " + media);
		System.out.printf("A média é: %.2f", media);
		
		//raiz quadrada da nota 1:
		nota1 = (float) Math.sqrt(nota2);
		//potência, ao cubo:
		nota2 = (float) Math.pow(nota3, 3);
		//módulo, resto da divisão - só funciona pra números inteiros:
		x = x % 2;
		
	}

}
