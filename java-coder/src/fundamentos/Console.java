package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom dia!!! ");
		System.out.print("Bom dia!!! ");
		System.out.print("Bom dia!!! ");
			
		System.out.println("Boa tarde!!");
		System.out.println("Boa tarde!!");
		System.out.println("Boa tarde!!");
		System.out.println("Boa tarde!!");
		
		String nome = "Pedro Uila";
		double salario = 800;
		System.out.printf("Nome: %s", nome);
		System.out.printf("\nSalario: R$%.2f", salario);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome:");
		nome = entrada.nextLine();
		System.out.println("Digite a sua idade:");
		int idade = entrada.nextInt();
		System.out.printf("\nNome: %s \nIdade: %d anos",nome, idade);
		
	}
}
