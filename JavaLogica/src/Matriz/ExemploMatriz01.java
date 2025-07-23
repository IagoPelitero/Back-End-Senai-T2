package Matriz;

import java.util.Scanner;

public class ExemploMatriz01 {
	int[][] mat = new int[3][3];
	int soma=0,l,c;
	Scanner ler = new Scanner(System.in);
	for(l=0;l<3;l++)
	{
		for(c=0;c<3;c++)
		{
			System.out.println("Diite o valor para a linha"+l+"coluna"+c);
			mat[l][c]=ler.nextInt();
			soma+=mat[l][c];
			soma=soma+mat[l][c];
		}
	}
}
