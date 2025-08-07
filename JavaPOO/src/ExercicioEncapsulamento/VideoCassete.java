package ExercicioEncapsulamento;

public class VideoCassete implements InterVideoCassete{
	
	private boolean ligado;
	private int fita=0;
	private boolean start=false;

	@Override
	public void ligar() {
		if(this.ligado==false) {
			this.ligado=true;
			this.start=true;
		}
		else
			System.out.println("A fita já está em produção..");
		
	}

	@Override
	public void desligar() {
		if(this.ligado==true) {
			this.ligado=false;
		}
		else
			System.out.println("A Fita não está mais rodando...");
		
	}

	@Override
	public void play() {
		if(this.ligado==true && this.start==false) {
			this.start=true;
		}else
			System.out.println("O video está parado ou desligado...");
		
	}

	@Override
	public void rebobinar() {
		if(this.ligado==true && this.start==true && this.fita>0) {
			this.fita-=5;
		}else
			System.out.println("Fita totalmente rebobinada...");
		
	}

	@Override
	public void avancar() {
		if(this.ligado==true && this.start==true && this.fita<100) {
			this.fita+=5;
		}else
			System.out.println("Fita já concluída...");
		
	}

	public int getFita() {
		return fita;
	}

	public void setFita(int fita) {
		this.fita = fita;
	}

	public boolean isLigado() {
		return ligado;
	}

	public boolean isStart() {
		return start;
	}

}
