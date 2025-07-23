package vetores;

import java.util.Scanner;

public class LogicaProfVetorSom {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vet1[] = new int[10];
		int vet2[] = new int[10];
		int soma[] = new int[10];
		for(int x=0; x<10; x++) {
			System.out.println("Digite o primeiro valor: ");
			vet1[x]=ler.nextInt();
			System.out.println("Digite o segundo valor: ");
			vet2[x]=ler.nextInt();
			soma[x]=vet1[x]+vet2[x];
		}
		System.out.println("Valores do primeiro vetor: ");
		for(int n=0; n<10; n++)
			System.out.println(vet1[n]+"\t");
		for(int n=0; n<10; n++)
			System.out.println(vet2[n]+"\t");
		for(int n=0; n<10; n++)
			System.out.println(soma[n]+"\t");
		
			

	}

}
