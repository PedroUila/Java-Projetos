package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola mundo".charAt(2));

		String s = "Boa tarde";
		
		//.concat() concatena strings 
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		//.startsWith() compara a string digitada com o início da armazenada e retorna true ou false
		//Maiúsculo e minúsculo tem diferença
		System.out.println(s.startsWith("Boa"));
		
		//.endsWith() compara a string digitada com o final da armazenada e retorna true ou false
		//Maiúsculo e minúsculo tem diferença
		System.out.println(s.endsWith("tarde"));
		
		//.equals() compara a string digita com toda a string armazenada
		
		System.out.println(s.equals("boa tarde"));
		// .equalsIgnoreCase() compara a string digitada com toda a string armazenada sem considerar cases
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Uila";
		var idade = 22;
		var salario = 800.00;
		System.out.printf("\n\n"
				+ "Nome: %s \n"
				+ "Sobrenome: %s \n"
				+ "Idade: %d \n"
				+ "Salario: R$%.2f"
				, nome, sobrenome, idade, salario);
		
		//String.format tem o mesmo atributo do printf, pois utiliza % e o nome da variável diretamente
		String frase = String.format("\n\n### Teste com String.format ### \n"
				+ "Nome: %s \nSobrenome: %s \nIdade: %d anos \nSalario: R$%.2f", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		//.contains("x") informa se há um parâmetro x na string a ser analisada
		System.out.println("Frase qualquer".contains("qual"));
		
		//.indexOf("x") informa a posição em que x começa 
		System.out.println("Frase qualquer".indexOf("qual"));
		
		//.substring(x) nos retorna a string em diante a partir da posição x passada
		System.out.println("Frase qualquer".substring(6));
	
		//.substring(x, y) nos retorna a string a partir da posição x até a posição y-1 passada
		System.out.println("Frase qualquer".substring(6, 9));
	}
}
