package ExercicioEncapsulamento;

public class TesteInterfaceIntegrado {

	public static void main(String[] args) {
		VideoTv vt = new VideoTv();
		
		vt.ligar();
		vt.trocarCanal(5);
		System.out.println(" A Video Tv está ligada?"+vt.isLigado());
		System.out.println("Está no canal: "+vt.getCanal());

	}

}
