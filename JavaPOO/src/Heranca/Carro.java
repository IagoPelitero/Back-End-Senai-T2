package Heranca;

public class Carro extends Veiculo{
	private String carroceria;
	protected Double combustivel;
	
	private boolean capota;
	
	public void baixarCapota() {
		if(capota==false)
			this.capota=true;
		else
			System.out.println("A capota já está baixada...");
		
	}
	
	public void subirCapota() {
		if (capota==true)
			this.capota=false;
		else
			System.out.println("A capota está levantada...");
		
	}

	public void estado() {
		System.out.println("A carroceria escolhida foi: "+this.carroceria);
		System.out.println("Ele está com "+this.combustivel+" litros");
		System.out.println("A capota está levantada? "+this.capota);
	}

	public String getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}

	public Double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Double combustivel) {
		this.combustivel = combustivel;
	}

	public boolean isCapota() {
		return capota;
	}

}
