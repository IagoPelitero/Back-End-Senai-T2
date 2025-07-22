package vetores;

import java.util.Scanner;

public class ExercicioVetor03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vet[] = new int[5];
		int n;
		System.out.println("Digite qual será o valor que será multiplicado");
		n=ler.nextInt();
		for(int x=0; x<5; x++)
		{
			vet[x]=x*n;
			System.out.println("\t"+vet[x]);
		}

		

	}

}
