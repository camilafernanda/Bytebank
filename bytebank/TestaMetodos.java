package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		Conta contaDaAna = new Conta();
		
		contaDoPaulo.deposita(100);
		contaDaAna.deposita(150);
		
		System.out.println("Conta da Ana: " + contaDaAna.saldo);
		System.out.println("Conta do Paulo: " + contaDoPaulo.saldo);
		
		contaDaAna.transfere(55, contaDoPaulo);
		
		System.out.println("Conta da Ana: " + contaDaAna.saldo);
		System.out.println("Conta do Paulo: " + contaDoPaulo.saldo);
	}
}
