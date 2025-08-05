package Encapsulamento;

import java.util.Scanner;

public class ExemploRadio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Radio r = new Radio();
		
		r.ligar();
		r.trocaEstacao(89.1);
		r.maisVol();
		
		System.out.println("Volume do rádio: "+r.getVolume());
		System.out.println("Estacao: "+r.getEstacao());
	}

}
