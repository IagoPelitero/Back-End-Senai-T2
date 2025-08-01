package Introducao;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ContaBancaria cb = new ContaBancaria();
		
		System.out.println("Digite o número da conta: ");
		int x=ler.nextInt();
		cb.setNumeroConta(x);
		
		
	}

}
