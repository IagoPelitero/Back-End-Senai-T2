package Encapsulamento;

public class ExercicioRelogio {

	public static void main(String[] args) {
		Relogio rel = new Relogio();
		
		rel.ligar();
		rel.trocaHora(21);
		rel.trocaMinuto(30);
		rel.trocaDia(12);
		rel.trocaMes(12);
		rel.trocaAno(2012);
		
		
		System.out.println("Agora são: "+rel.getHora()+":"+rel.getMinuto());
		System.out.println("\nA data do fim do mundo é: "+rel.getDia()+"/"+rel.getMes()+"/"+rel.getAno());
	}

}
