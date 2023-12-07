package salario1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		float salario;
		float abono;
		
		//Entrada do salario
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		System.out.println("Seu salário é: "+ salario);
		
		//Entrada do abono
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		System.out.println("Seu abono é: "+ abono);
		
		//Calculo novo salario
				float NovoSalario = salario+abono;
				
				System.out.println("Seu novo salário é: "+NovoSalario);
	}

}
