package Encapsulamento;

public class Radio implements InterfaceRadio{
	private int volume;
	private boolean ligado;
	private double estacao;
	@Override
	public void ligar() {
		if(this.ligado==false) {
			this.ligado=true;
			this.volume=10;
		}
		else
			System.out.println("O rádio já está ligado...");
	}
	@Override
	public void desligar() {
		if(this.ligado==true) {
			this.ligado=false;
		}
		else
			System.out.println("O rádio já está desligado...");
		
	}
	@Override
	public void maisVol() {
		if(this.ligado==true && this.volume<100){
		this.volume+=5;
		}
		else
			System.out.println("Volume no máximo ou radio desligado!");
	}
	@Override
	public void menosVol() {
		if(this.ligado==true && this.volume>0) {
			this.volume-=5;
		}
		else
			System.out.println("Radio mudo ou desligado...");
		
	}
	@Override
	public void trocaEstacao(double estacao) {
		this.estacao=estacao;
		
	}
	
	

}
