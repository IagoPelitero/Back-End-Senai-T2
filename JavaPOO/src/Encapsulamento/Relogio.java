package Encapsulamento;

public class Relogio implements InterfaceRelogio{
	
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private boolean ligado;
	@Override
	public void ligar() {
		if(this.ligado==false) {
			this.ligado=true;
			this.hora=12;
			this.minuto=00;
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
	public void trocaHora(int hora) {
		this.hora=hora;
		
	}
	@Override
	public void trocaMinuto(int minuto) {
		this.minuto=minuto;
		
	}
	@Override
	public void trocaDia(int dia) {
		this.dia=dia;
		
	}
	@Override
	public void trocaMes(int mes) {
		this.mes=mes;
		
	}
	@Override
	public void trocaAno(int ano) {
		this.ano=ano;		
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public boolean isLigado() {
		return ligado;
	}
	
	
	
}