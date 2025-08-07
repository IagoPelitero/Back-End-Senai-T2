package ExercicioEncapsulamento;

public class VideoTv implements InterVideoCassete, InterTv {
	
	private int vol;
	private double canal;
	private boolean ligado;
	private int duracao;

	@Override
	public void mailVol() {
		if(this.ligado==true && this.vol<100){
			this.vol+=5;
			}
			else
				System.out.println("Volume no máximo ou VideoTv desligado!");
		
	}

	@Override
	public void menosVol() {
		if(this.ligado==true && this.vol>0) {
			this.vol-=5;
		}
		else
			System.out.println("VideoTv mudo ou desligado...");
		
	}

	@Override
	public void trocarCanal(double canal) {
		this.canal=canal;
		
	}

	@Override
	public void ligar() {
		if(this.ligado==false) {
			this.ligado=true;
			this.vol=10;
		}
		
	}

	@Override
	public void desligar() {
		if(this.ligado==true)
			this.ligado=false;
		
	}

	@Override
	public void play() {
		if(this.ligado==true && this.duracao>0) 
			this.duracao++;
		
		
	}

	@Override
	public void rebobinar() {
		if(this.ligado==true && this.duracao>0) 
			this.duracao-=5;
		
		
	}

	@Override
	public void avancar() {
		if(this.ligado==true && this.vol<100) 
			this.vol+=5;
		
		
	}

	public int getVol() {
		return vol;
	}

	public double getCanal() {
		return canal;
	}

	public boolean isLigado() {
		return ligado;
	}

	public int getDuracao() {
		return duracao;
	}
	
	

}
