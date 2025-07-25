package Matriz;

import java.util.Scanner;

public class ProfLogcEx05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int proximo=0, anterior=0, atual=1, init, raz;
		int [][] mat = new int [3][10];
		
		System.out.println("Digite o valor de inicio: ");
		init=ler.nextInt();
		System.out.println("Digite a razao: ");
		raz=ler.nextInt();
		mat[0][0]=atual;
		mat[1][0]=init;
		mat[2][0]=init;
		
		for(int linha=0; linha<3;linha++)
		{
			for(int col=1;col<10;col++)
			{
				switch(linha)
				{
				case 0:
					proximo=atual+anterior;
					mat[linha][col]=atual;
					anterior=atual;
					atual=proximo;
					break;
				case 1:
					mat[linha][col]=mat[linha][col-1]+raz;
					break;
				case 2:
					mat[linha][col]=mat[linha][col-1]*raz;
				}
			}
		}
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<10;c++)
			{
				System.out.print(mat[l][c]+"\t");
			}
			System.out.println();
		}
		
	}

}
