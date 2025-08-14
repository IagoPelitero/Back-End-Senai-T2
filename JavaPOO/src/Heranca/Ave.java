package Heranca;

public class Ave extends Animal{
	
	private String tipo;

	@Override
	public void comer() {
		System.out.println("A ave está comendo");
		
	}

	@Override
	public void locomover() {
		System.out.println("A ave está voando ou pulando!");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A ave está cantarolando!");
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
