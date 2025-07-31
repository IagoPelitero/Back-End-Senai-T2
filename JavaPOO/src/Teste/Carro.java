package Introducao;

public class Carro {
	String marca;
	String modelo; 
	String cor;
	int ano; 
	int velocidade; 
	boolean ligado;
	
	public Carro(String marca, String modelo, String cor) {
		this.ano=2025;
		this.cor=cor;
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public void ligar() {
		if(this.ligado==false) {
			this.ligado=true;
		}else 
			System.out.println("Erro! Carro está ligado!");
	}
	
	public void desligar() {
		if(this.ligado==true) {
			this.ligado=false;
		}else {
			System.out.println("Erro, carro está desligado");
		}
	}
	public void acelerar() {
		if(this.ligado==true) {
			this.velocidade+=5;
		}else {
			this.velocidade=0;
		}
	}
	public void freiar() {
		if(this.ligado==true && this.velocidade>0) {
			this.velocidade-=5;
		}else
			System.out.println("Verifique se o carro está parado ou desligado");
	}
	public void estado() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ano: "+this.ano);
		System.out.println("O carro está ligado? "+this.ligado);
		System.out.println("A velocdade do carro esta em "+this.velocidade+" km/h");
	}
}