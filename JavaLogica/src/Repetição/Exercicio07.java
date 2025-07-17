package Repetição;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, fib1=0, fib2=1, contagem;
		System.out.println("Digite um número: ");
		num=ler.nextInt();
		for (int f=1; f<=num; f++) {
		contagem = (fib1+fib2);
		fib1 = fib2;
		fib2 = contagem;
		System.out.println(fib1);
		}
		
	}

}

