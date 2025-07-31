package Teste;

public class Barco {
	
	private String tipo;
	private int nPass;
	private int velocidade;
	private boolean ligado;
	
	public void ligar() {
		if(this.ligado==false) {
			this.ligado=true;
		}else
			System.out.println("Erro! Barco está ligado!");
	}
	public void desligar() {
		if(this.ligado==true) {
			this.ligado=false;
		}else {
			System.out.println("Erro, barco está desligado");
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
			System.out.println("Verifique se o barco está parado ou desligado");
	}
	public void estado() {
		System.out.println("Tipo do barco: "+this.tipo);
		System.out.println("Cabe "+this.nPass+" passageiros!");
		System.out.println("O barco está ligado? "+this.ligado);
		System.out.println("A velocdade do barco esta em "+this.velocidade+" km/h");
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getnPass() {
		return nPass;
	}
	public void setnPass(int nPass) {
		this.nPass = nPass;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public boolean isLigado() {
		return ligado;
	}

}
