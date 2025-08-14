package Heranca;

public class Motocicleta extends Carro{
	private Double cilindradas;
	private Double motor;
	
	@Override
	public void estado() {
		System.out.println("Ele está com "+this.combustivel+" litros");
		System.out.println("A moto possui: "+this.cilindradas+"cilindradas");
		System.out.println("Seu motor é: "+this.motor);
	}

	public Double getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Double cilindradas) {
		this.cilindradas = cilindradas;
	}

	public Double getMotor() {
		return motor;
	}

	public void setMotor(Double motor) {
		this.motor = motor;
	}

}
