package Repetição;

import java.util.Scanner;

public class ExercicioForAninhado04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,j,user;
		System.out.println("Digite o número de tabuada que deseje começar: ");
		user=ler.nextInt();
		for(j=user;j<=9;j++)
		{
			System.out.println("Tabuado do "+j);
			for(i=1;i<=10;i++)
				System.out.println(j+" x "+i+" = "+j*i);
		}

	}

}
