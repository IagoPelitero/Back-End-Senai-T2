package Heranca;

public class ExercicioHeranca01 {

	public static void main(String[] args) {
		Carro c = new Carro();
		Motocicleta m = new Motocicleta();
		
		c.estadoVeiculo();
		c.estado();
		
		System.out.println("Seu carro");
		
		m.estadoVeiculo();
		m.estado();
		
		System.out.println("Sua moto");

	}

}
