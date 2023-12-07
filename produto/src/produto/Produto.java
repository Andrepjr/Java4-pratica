package produto;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		//Definir variaveis
		float n1;
		float n2;
		float n3;
		float n4;
		
		//Entrada dos numeros
		System.out.println("Digite o numero 1: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o numero 2: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o numero 3: ");
		n3 = leia.nextFloat();
		System.out.println("Digite o numero 4: ");
		n4 = leia.nextFloat();
		
		//Mostrar diferenças
		
		float diferencas = (n1*n2)-(n3*n4);
		System.out.println("A diferença é: "+ diferencas);
	}

}
