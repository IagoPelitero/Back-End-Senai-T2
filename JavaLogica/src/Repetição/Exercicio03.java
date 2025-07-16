package Repetição;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		int numTab;
		System.out.println("Digite um número: ");
		numTab=ler.nextInt();
		for(int tab=10; tab>=1; tab--)
			System.out.println(numTab+"x"+tab+"="+numTab*tab);

	}

}
