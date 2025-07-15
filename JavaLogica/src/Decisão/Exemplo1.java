package Decisão;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.println("Digite um número");
		x=ler.nextInt();
		if(x>5)
			System.out.println("Você digitou um número maior que 5");
		
		else if(x==5)
			System.out.println("Você digitou 5!");
		
		else
			System.out.println("Você digitou um número menor que 5");
		System.out.println("Fim do programa!");
	}

}
