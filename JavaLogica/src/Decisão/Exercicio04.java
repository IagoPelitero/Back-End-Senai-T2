package Decisão;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float alt1, alt2;
		System.out.println("Digite a primeira altura: ");
		alt1=ler.nextFloat();
		System.out.println("Digite a segunda altura: ");
		alt2=ler.nextFloat();
		if(alt1<alt2)
			System.out.println("A segunda digitada é mais alta!");
		else if(alt1==alt2)
			System.out.println("Ambos possuem a mesma altura!");
		else
			System.out.println("A primeira digitada é mais alta!");

	}

}
