package Repetição;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, raz, fim;
		System.out.println("Digite um número: ");
		num=ler.nextInt();
		System.out.println("Digite a razão: ");
		raz=ler.nextInt();
		System.out.println("Digite até que número deve chegar: ");
		fim=ler.nextInt();
		for (int calc=num; calc<=fim; calc+=raz)
			System.out.println("A progressão Aritmética do "+num+" é: "+calc);
	}

}
