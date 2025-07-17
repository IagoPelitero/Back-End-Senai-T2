package Repetição;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int user, fat = 1;
		System.out.println("Digite um número e descubra seu fator: ");
		user=ler.nextInt();
		for (int i = 1; i <=user;i++)
			fat*=i;
			System.out.println("O fator do "+user+" e "+fat);

	}

}
