package Introducao;

public class Caneta {
	//CARACTERÍSTICAS => ATRIBUTOS
	String cor;
	int carga;
	float ponta;
	boolean tampada;
	
	//COMPORTAMENTOS => MÉTODOS
	public void tampar() {
		if(this.tampada==true) {
			System.out.println("Erro! Caneta já está tampada.");
		}
		else 
			this.tampada=true;
	}
	
	public void destampar() {
		if(this.tampada==true) {
			this.tampada=false;
		}
		else 
			System.out.println("Erro! Caneta já está destampada!");
	}
	public void escrever() {
		if(this.carga==0) {
			System.out.println("Erro! Caneta sem carga.");
		}
		else if(this.tampada==true) {
			System.out.println("Erro! Caneta tampada.");
		}
		else
		{
			System.out.println("Escrevendo...");
			this.carga-=5;
		}
		
	}
	
	public void estado() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Esta tampada? "+this.tampada);
		System.out.println("A carga esta em "+this.carga+"%");
	}

}
