package Encapsulamento;

public interface ProfInterfaceRelogio {
	public abstract void ligar();
	public abstract void desligar();
	public abstract int mostrarHora();
	public abstract int mostrarMinuto();
	public abstract void trocaHora(int hora);
	public abstract void trocaMinuto(int minuto);

}
