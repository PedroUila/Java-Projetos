package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		Float f = 123.10F;
		Double d = 50.0;
		
		Boolean bo = Boolean.parseBoolean("opa");
		Character c = '#';
		
		System.out.println(d.byteValue());
		System.out.println(s.toString());
		System.out.println(bo.toString().toUpperCase());
	}
}