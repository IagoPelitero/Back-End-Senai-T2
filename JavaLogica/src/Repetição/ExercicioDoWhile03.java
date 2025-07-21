package Repetição;

import java.util.Scanner;

public class ExercicioDoWhile03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int resp;
		do {
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
			System.out.println("Digite 1 para continuar ou 0 para parar: ");
			resp=ler.nextInt();
			
		}while(resp!=0);

	}

}
