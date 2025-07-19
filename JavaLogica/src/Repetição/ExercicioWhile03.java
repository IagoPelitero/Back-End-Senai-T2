package Repetição;

import java.util.Scanner;

public class ExercicioWhile03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int resp=-1;
		while(resp==-1) 
		{
			int proximo=0,anterior=0,atual=1,limite;
			System.out.println("Quantos numeros fibonnacci deseja gerar? ");
			limite=ler.nextInt();
			System.out.println(atual);
			for(int n=1;n<limite;n++)
			{
				proximo=atual+anterior;
				System.out.println(proximo);
				anterior=atual;
				atual=proximo;
			}
			System.out.println("Pressione -1 para repetir: ");
		}
	}
}

		
	
