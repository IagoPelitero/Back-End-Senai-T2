package Heranca;

public class Peixe extends Animal{
	
	private String habitat;

	@Override
	public void comer() {
		System.out.println("O peixe está comendo!");
		
	}

	@Override
	public void locomover() {
		System.out.println("O peixe está nadando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O peixe está atraindo outros da mesma espécie ou cantarolando!");
		
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	

}
