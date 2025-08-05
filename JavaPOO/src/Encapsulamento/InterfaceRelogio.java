package Encapsulamento;

public interface InterfaceRelogio {
	
	public abstract void ligar();
	public abstract void desligar();
	public abstract void trocaHora(int hora);
	public abstract void trocaMinuto(int minuto);
	public abstract void trocaDia(int dia);
	public abstract void trocaMes(int mes);
	public abstract void trocaAno(int ano);
}
