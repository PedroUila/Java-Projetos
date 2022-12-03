package fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		
		//Tipos primitivos não possuem o operador "."
		//Devemos nos ater aos tipos dos resultados que irá nos retornar
		
		String s = "Bom dia, x";
		s = s.replace("x", "Senhora"); //substitui o primeiro termo p
		s = s.toUpperCase(); //transforma em maiúscula
		s = s.concat("!!!"); //concatena a string digitada
		
		
		System.out.println(s);
	}
}
