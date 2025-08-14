package Arraylist;

public class Aula {
	
	private int tempo;
	private String titulo;
	
	public Aula(String ti, int te) {
		this.titulo=ti;
		this.tempo=te;
		
	}
	
	
	
	public int getTempo() {
		return tempo;
	}



	public void setTempo(int tempo) {
		this.tempo = tempo;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String toString() {
		return "Aula: "+this.titulo+", "+this.tempo+" horas";
	}

}
