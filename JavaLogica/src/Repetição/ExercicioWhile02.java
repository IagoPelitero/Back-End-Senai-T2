package Repetição;

import java.util.Scanner;

public class ExercicioWhile02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, resp;
		System.out.println("Digite 1 para saber se um número é par ou impar");
		resp=ler.nextInt();
		while(resp==1) {
			System.out.println("Digite um numero: ");
			n=ler.nextInt();
				if(n%2==0)
					System.out.print("Número par!");
			
				else 
					System.out.print("Número ímpar!");
			
			System.out.println("\nDigite 1 se quiser continuar ");
			resp=ler.nextInt();
			
	}
	}
	}

