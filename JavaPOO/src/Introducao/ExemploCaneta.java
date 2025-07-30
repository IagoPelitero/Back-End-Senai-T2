package Introducao;

public class ExemploCaneta {

	public static void main(String[] args) {
		Caneta bic = new Caneta("Verde", 0.5);
		Caneta kilometrica = new Caneta("Laranja", 1.5);
		
		System.out.println("Estado da caneta bic");
		bic.estado();		
		System.out.println("\nEstado da caneta bic");
		kilometrica.estado();
	}

}
