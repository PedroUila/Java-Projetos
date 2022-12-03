package fundamentos;

public class NumeroToString {
	public static void main(String[] args) {
	    Integer num1 = 1000; 
	    // com o integer, podemos usar a notação ponto diretamente

	    System.out.println(num1.toString().length()); 
	    // tamanho da string

	    
	    int num2 = 500;
	    // com int precisamos fazer o chamado da classe Integer

	    System.out.println(Integer.toString(num2)); 

	}
}
