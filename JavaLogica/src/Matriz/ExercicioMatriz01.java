package Matriz;

import java.util.Scanner;

public class ExercicioMatriz01 {

	public static void main(String[] args) {
			int[][] mat = new int[3][4];
			int mult=2,l,c;
			Scanner ler = new Scanner(System.in);
			for(l=0;l<3;l++)
			{
				for(c=0;c<4;c++)
				{
					System.out.println("Digite o valor para a linha "+l+" coluna "+c);
					mat[l][c]=ler.nextInt();
					mult*=mat[l][c];
				}
			}
				for(l=0;l<3;l++)
				{
					for(c=0;c<4;c++)
					{
						System.out.println(mat[l][c]+"\t");
					}
					System.out.println();
				}
				System.out.println("A multiplicação dos valores da matriz é: "+mult);
			}
		}
