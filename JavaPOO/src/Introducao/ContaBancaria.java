package Introducao;

public class ContaBancaria {
	
	private int numeroConta;
	private String titular;
	private double saldo;
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		if(numeroConta >= 0 && numeroConta <= 999999) {
		this.numeroConta=numeroConta;
	} else {
		System.out.println("Erro! Conta com mais de 6 dígitos.");
	}
	}
	public String getTitular() {
		return titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo<0) {
			System.out.println("Erro! Sem saldo.");
		}else
		this.saldo = saldo;
	}
	
	

}
