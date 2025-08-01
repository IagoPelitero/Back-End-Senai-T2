package Teste;

public class Carro {
	private String marca;
	private String modelo; 
	private String cor;
	private int ano; 
	private int velocidade; 
	private boolean ligado;
	
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

	
	//MÉTODOS ACESSORES E MODIFICADORES
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public boolean isLigado() {
		return ligado;
	}
	
	
}