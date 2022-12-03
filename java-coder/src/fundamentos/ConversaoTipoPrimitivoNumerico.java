package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //conversão implícita
		System.out.println(a);
		
		float b = 1.123456789f; //conversão explícita (cast)
		System.out.println(b);
		
		int c = 255;
		byte d = (byte) c; //conversão explícita (cast)
		System.out.println(d);
	}
}
