package salariobruto;

import java.util.Scanner;

public class SalarioBruto {

	public static void main(String[] args) {
		
		//definindo variaveis
		Scanner leia = new Scanner(System.in);
		float salariobruto;
		float adicionalnoturno;
		float extras;
		float descontos;
		
		//solicitar a entrada para usuario
		
		System.out.println("Digite o seu salario bruto: ");
		salariobruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		adicionalnoturno = leia.nextFloat();
		System.out.println("Digite as horas extras: ");
		extras = leia.nextFloat();
		System.out.println("Digite os descontos: ");
		descontos = leia.nextFloat();
		
		//calculo do salario liquido
		float salarioliquido = salariobruto + adicionalnoturno + (extras*5)- descontos;
		
		System.out.println("O seu salário liquido é: "+ salarioliquido);
		
		

	}

}
