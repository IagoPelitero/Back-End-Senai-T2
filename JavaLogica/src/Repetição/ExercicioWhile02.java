package Repetição;

import java.util.Scanner;

public class ExercicioWhile02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, result, resp;
		System.out.println("Digite 1 para saber se um número é par ou impar");
		resp=ler.nextInt();
		while(resp==1) {
			System.out.println("Digite um numero: ");
			n=ler.nextInt();
			result = n%2;
			if(result==0) {
			System.out.print("Número par!");
			System.out.println("\nDigite 1 se quiser continuar ");
			resp=ler.nextInt();
			}
			else {
				System.out.print("Número ímpar!");
				System.out.println("\nDigite 1 se quiser continuar ");
				resp=ler.nextInt();
			}
	}
	}
	}

