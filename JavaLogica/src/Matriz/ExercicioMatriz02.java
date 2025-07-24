package Matriz;

import java.util.Scanner;

public class ExercicioMatriz02 {
	public static void main(String[] args) {
		int[][] mat1 = new int[3][4];
		int[][] mat2 = new int[3][4];
		int[][] soma = new int[3][4];
		int somaTotal=0,l,c;//em algumas situações precisamos atritbuir o valor para que a soma seja realizada.
		Scanner ler = new Scanner(System.in);
		for(l=0;l<3;l++)
		{
			for(c=0;c<4;c++)
			{
				System.out.println("Digite o valor para a linha "+l+" coluna "+c);
				mat1[l][c]=ler.nextInt();
				System.out.println("Digite o valor para segunda matriz "+l+" coluna "+c);
				mat2[l][c]=ler.nextInt();
				soma[l][c]=mat1[l][c]+mat2[l][c];
				somaTotal+=soma[l][c];//aqui o soma total está atriuido a 0 e em seguida ele acumula o valor
				//e adiciona 1. Ou seja durante os passos do for ele acrescenta o que consta na variável 
				
			}
		}
			for(l=0;l<3;l++)
			{
				for(c=0;c<4;c++)
				{
					System.out.println(soma[l][c]+"\t");
				}

				System.out.println();
			}
			System.out.println("A soma dos valores da matriz é: "+somaTotal);
}
	
	}