package Matriz;

import java.util.Scanner;

public class ExercicioMatriz03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] fipapg = new int[3][10];
		int init,raz,proximo=0,anterior=0, atual=1, l, c;
		for(l=0;l<3;l++) {
			fipapg[0][0]=atual;
			for(int n=1; n<10; n++) {
				proximo=atual+anterior;
				fipapg[0][n]=atual;
				anterior=atual;
				atual=proximo;
			}
			System.out.println("Digite o valor de inicio: ");
			init=ler.nextInt();
			System.out.println("Digite a razão: ");
			raz=ler.nextInt();
			fipapg[1][0]=init;
			for(int x=1;x<10;x++) {
				fipapg[1][x] = fipapg[1][x - 1] + raz;
			}
			System.out.println("Digite o valor de inicio: ");
			init=ler.nextInt();
			System.out.println("Digite a razão: ");
			raz=ler.nextInt();
			fipapg[2][0]=init;
			for(int x=1;x<10;x++) {
				fipapg[2][x] = fipapg[2][x - 1] * raz;
			}
		for(l=0;l<3;l++) {
			for(c=0;c<10;c++) {
				System.out.print(fipapg[l][c]+"\t");
			}
		System.out.println();
		}
		}

	}

}
