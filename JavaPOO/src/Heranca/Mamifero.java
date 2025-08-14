package Heranca;

public class Mamifero extends Animal{
	
	private boolean a;
	
	public void amamentar() {
		if(a==false) 
			this.a=true;
		else
			System.out.println("Já está amanetando...");
	}

	@Override
	public void comer() {
		System.out.println("Hora de comer!");
		
	}

	@Override
	public void locomover() {
		System.out.println("O bicho está caminhando!");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O bicho está latindo!");
		
	}

	public boolean isA() {
		return a;
	}
	
	

}
