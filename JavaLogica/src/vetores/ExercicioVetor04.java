package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetor04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int vet1[] = new int[10];
		int vet2[] = new int[10];
		int soma[] = new int[10];
		System.out.println("Digite a primeira sequência de números: ");
		for(int n1 = 0; n1<10; n1++) {
			vet1[n1]=ler.nextInt();
		}
		System.out.println("Digite a segunda sequência de números: ");
		for(int n2 = 0; n2<10; n2++)
			vet2[n2]=ler.nextInt();
	
		for(int n3=0; n3<10; n3++)
			soma[n3]= vet1[n3]+vet2[n3];
		
		System.out.println("A primeira sequência de números são: "+Arrays.toString(vet1));
		
		System.out.println("A segunda sequência de números são: "+Arrays.toString(vet2));
		
		System.out.println("A soma dos números são: "+Arrays.toString(soma));
}
	}
