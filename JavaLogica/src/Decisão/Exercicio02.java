package Decisão;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade=ler.nextInt();
		if(idade < 18)
			System.out.println("Ops! Você não tem a idade permitida!");
		else
			System.out.println("Usuário aceito (Possui 18 anos ou mais). Seja bem vindo!");

	}

}
