package JavaTech;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println ("Digite o primeiro valor: ");
		n1 = leia.nextFloat();
		
		System.out.println ("Digite o segundo valor: ");
		n2 = leia.nextFloat();
		
		System.out.println ("Digite o terceiro valor: ");
		n3 = leia.nextFloat();
		
		System.out.println ("Digite o quarto valor: ");
		n4 = leia.nextFloat();

		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println ("A diferença do produto entre os valores 1 e 2, 3 e 4 é de: " + diferenca);
	}

}
