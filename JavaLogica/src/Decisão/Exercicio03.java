package Decisão;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int number, result;
		System.out.println("Digite um número: ");
		number=ler.nextInt();
		result = number % 2;
		if(result==0)
			System.out.println("Este número é par!");
		else
			System.out.println("Este número é ímpar!");

	}

}
