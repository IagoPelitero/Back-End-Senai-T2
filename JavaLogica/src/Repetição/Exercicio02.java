package Repetição;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numTab;
		System.out.println("Digite um número: ");
		numTab=ler.nextInt();
		for(int tab=0; tab<=10; tab++)
			System.out.println(numTab+"x"+tab+"="+numTab*tab);
	}

}
