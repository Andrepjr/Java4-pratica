package exemplos;

import java.util.Scanner;

public class Exemplo_7 {

	public static void main(String[] args) {
	// Utilizar o dafault caso o usuario não utilize um caso padrão

		int opcao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### ##### Menu # ## ### #### #####");
		System.out.println("\n--Digite 1 para ver indicação de livro-- ");
		System.out.println("--Digite 2 para ler uma frase motivacional-- ");
		System.out.println("--Digite 3 para receber uma indicação de musica-- ");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1 :
			System.out.println("Livro Jogos Vorazes");
			break;
		case 2: 
			System.out.println("Frase Motivacional: A vida é bela");
			break;
		case 3:
			System.out.println("Coldplay");
			break;
		//Default exemplo
		default: 
			System.out.println("Opção Invalida");
			
		}
		
	}

}
