package Repetição;

import java.util.Scanner;

public class ExercicioDoWhile04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int resp;
		do {
			int n, i;
			System.out.print("Digite um número para mostrar a tabuada: ");
			for(n=ler.nextInt();n<=9;n++)
		{
			System.out.println("Tabuado do "+n);
			for(i=1;i<=10;i++)
				System.out.println(n+" x "+i+" = "+n*i);
		}
			System.out.print("Se deseja criar começar por outro digite 1 ou digite 0 se deseja parar : ");
			resp=ler.nextInt();
		}while(resp!=0);

	}

}
