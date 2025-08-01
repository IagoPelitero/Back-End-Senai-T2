package Introducao;

public class ContaBancaria {
	
	private int numeroConta;
	private String titular;
	private double saldo;
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		if(numeroConta>6) {
		System.out.println("Conta com mais de 6 dígitos.");
	} else {
		this.numeroConta=numeroConta;
	}
	}
	public String getTitular() {
		return titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo<6) {
			System.out.println("Erro! Sem saldo.");
		}else
		this.saldo = saldo;
	}
	
	

}
