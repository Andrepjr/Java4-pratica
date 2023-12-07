package exemplos;

import java.util.Scanner;

public class Exemplo_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exemplos utilizando IF encadeado, 	else if
				float nota1, nota2, media;
				Scanner leia = new Scanner(System.in);
				
				System.out.println("Digite a primeira nota: ");
				nota1 = leia.nextFloat();
				
				System.out.println("Digite a segunda nota: ");
				nota2 = leia.nextFloat();
				
				media = (nota1 + nota2)/2;
				
				if(media >= 6) {
					System.out.println("Parabéns, você foi aprovado");
				}
				else if(media == 5) {
					System.out.println("Você está de exame:");
				}
				else if(media == 0) {
					System.out.println("Você está expulso do colégio");
				}
				
				else {
					System.out.println("Você foi reprovado");
				}
	}
	

}
