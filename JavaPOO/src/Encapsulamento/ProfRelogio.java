package Encapsulamento;

public class ProfRelogio implements ProfInterfaceRelogio{
	
	private boolean ligado;
	private int hora;
	private int minuto;
	@Override
	public void ligar() {
		if(this.ligado==false) {
			this.ligado=true;
		}
		else
			System.out.println("O relógio já está ligado...");
		
	}
	@Override
	public void desligar() {
		if(this.ligado==true) {
			this.ligado=false;
		}
		else
			System.out.println("O relógio já está desligado...");
		
	}
	@Override
	public int mostrarHora() {
		return this.hora;
		
	}
	@Override
	public int mostrarMinuto() {
		return this.minuto;
		
	}
	@Override
	public void trocaHora(int hora) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void trocaMinuto(int minuto) {
		// TODO Auto-generated method stub
		
	}
	

}
