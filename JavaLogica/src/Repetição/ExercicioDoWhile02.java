package Repetição;

import java.util.Scanner;

public class ExercicioDoWhile02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int nr;
		do{
			System.out.print("Digite um numero (0 para finalizar):");
			nr=ler.nextInt();
			if (nr%2==0) //se o resto da divisão por 2 for 0
				System.out.print("Este número é par");
			else
				System.out.print("Este número é impar");
		}while (nr!=0); //enquanto nr for diferente de 0

	}

}
