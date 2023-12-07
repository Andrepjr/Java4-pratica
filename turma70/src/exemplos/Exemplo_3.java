package exemplos;

public class Exemplo_3 {

	public static void main(String[] args) {
		
		int idade = 18;
		boolean carteiraM = true;
		
		//&& duas condições precisam ser verdadeiras
		if(idade >= 18 && carteiraM == true) {
			System.out.println("Você pode dirigir");
		}
		
		//|| uma condição verdadeira apenas
		if(idade >= 18 || carteiraM == false) {
			System.out.println("Você pode dirigir");
		}

	}

}