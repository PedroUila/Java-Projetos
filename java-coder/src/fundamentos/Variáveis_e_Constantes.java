package fundamentos;

import java.util.Scanner;

public class Variáveis_e_Constantes {
	public static void main(String[] args) {
		// Covertendo Fahrenheit para Celsius -> °C = (°F - 32) x 5/9;

	    // Definindo as constantes de subtração e multiplicação 
	    final int subtracao = 32;
	    final double fcorrecao = 5.0/9.0;

	    // Definindo a variável °F
	    System.out.println("Informe o grau em Fahrenheit: ");
	    
	    Scanner entrada = new Scanner(System.in);
	    double f = entrada.nextDouble();
	    
	    
	    // Definindo a variável °C
	    double c = (f - subtracao) * fcorrecao;
	    
	    
	    entrada.close();
	    System.out.printf("%.2f °F equivale a %.2f °C", f, c);
	}
}
