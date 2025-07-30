package Introducao;

public class Carro {
	String marca, modelo, cor;
	int ano, velocidade, acelerar, freiar;
	boolean ligar, desligar;
	
	public Carro(String marca, String modelo, String cor, int ano,int velocidade) {
		this.marca=marca;
		this.ano=ano;
		this.cor=cor;
		this.velocidade=velocidade;
		this.modelo=modelo;
		this.acelerar=0;
		this.desligar=true;
		
	}
	
	public void lCarro() {
		if(this.ligar==true) {
			System.out.println("Erro! Carro está ligado!");
		}else 
			this.ligar=true;
	}
	
	public void dCarro() {
		if(this.desligar==true) {
			System.out.println("Erro! Carro está desligado.");
		}else
			this.desligar=true;
	}
	
	public void andar() {
		if(this.acelerar==0) {
			System.out.println("Erro! Carro não está acelerando.");
		} else if (this.desligar==true) {
			System.out.println("Erro! Carro está desligado!");
		}else 
		{
			System.out.println("Acelerando...");
			acelerar+=10;
		}
		
					
	}
	public void parar() {
		if(this.freiar==0) {
			System.out.println("Erro! Carro já está freiando");
		}else if (this.desligar==true) {
			System.out.println("Erro! Carro está desligado.");
		}else {
			System.out.println("Freiando...");
			this.freiar-=5;
		}
		
	}
	
	public void estado() {
		
	}
	
}
