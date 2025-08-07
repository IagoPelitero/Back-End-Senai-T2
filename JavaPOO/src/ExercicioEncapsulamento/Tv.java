package ExercicioEncapsulamento;

public class Tv implements InterTv{
	
	private boolean ligado;
	private boolean start;
	private double canal;
	private int vol;

	@Override
	public void ligar() {
		if(this.ligado==false) {
			this.ligado=true;
			this.start=true;
			this.vol=20;
		}else 
			System.out.println("Tv já está ligada...");
		
	}

	@Override
	public void desligar() {
		if(this.ligado==true) {
			this.ligado=false;
			this.start=false;
		}else
			System.out.println("Tv está desligada...");
		
	}

	@Override
	public void play() {
		if(this.ligado==true && this.start==false) {
			this.start=true;
			this.vol=20;
		}else
			System.out.println("A Tv já está rodando...");
		
	}

	@Override
	public void mailVol() {
		if(this.ligado==true && this.start==true && this.vol<100) {
			this.vol+=5;
		}else
		System.out.println("Tv está com volume no máximo...");
	}

	@Override
	public void menosVol() {
		if(this.ligado==true && this.start==true && this.vol>0) {
			this.vol-=5;
		}else
		System.out.println("Tv no mudo...");
	}

	@Override
	public void trocarCanal(double canal) {
		this.canal=canal;
		
	}

}
