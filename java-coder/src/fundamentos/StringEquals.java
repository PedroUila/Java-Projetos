package fundamentos;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		System.out.println("### Comparacao com == ###");
		System.out.println("2" == "2");
		
		
		System.out.println("### Comparacao com .equals() ###");		
		Scanner entrada = new Scanner(System.in);
		String comparacao = entrada.nextLine();
		System.out.println("2".equals(comparacao.trim())); //.trim() retira os espaços em branco
		// o equals leva em conta apenas 
		// o conteúdo interno da variável
		
		entrada.close();
		
	}
}
