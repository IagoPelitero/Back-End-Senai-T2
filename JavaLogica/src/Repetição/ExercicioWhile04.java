package Repetição;

import java.util.Scanner;

public class ExercicioWhile04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int resp=-1;
		while(resp=-1){
			int n, i;
			System.out.printIn("Digite um número para mostrar a tabuada: ");
			for(n=ler.nextInt();n<=9;n++)
		{
			System.out.println("Tabuado do "+n);
			for(i=1;i<=10;i++)
				System.out.println(n+" x "+i+" = "+n*i);
		}
			System.out.printIn("Se deseja criar começar por outro digite -1: ");
			n=ler.nextIn();
	}

}
