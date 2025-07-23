package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetor05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int fib[] = new int[10];
		int pa[] = new int[10];
		int pg[] = new int[10];
		int proximo=0,atual=0,anterior=1, num1, raz1, num2, raz2;
		for(int n=1;n<10;n++)
		{
			proximo=atual+anterior;
			System.out.println(proximo);
			anterior=atual;
			atual=proximo;
			
			fib[n]=atual;
			
			System.out.println(fib[n]);
		}
		System.out.println("Digite um número: ");
		num1=ler.nextInt();
		System.out.println("Digite a razão: ");
		raz1=ler.nextInt();
		for (int i1=0; i1<pa.length; i1++) {
			pa[i1]=num1+(i1*raz1);
			System.out.println(pa[i1]);
		}
		System.out.println("Digite um número: ");
		num2=ler.nextInt();
		System.out.println("Digite a razão: ");
		raz2=ler.nextInt();
		for (int i2=0; i2<pa.length; i2++) {
			pg[i2]= (int)(num2 * Math.pow(raz2, i2));
			System.out.println(pg[i2]);
		}
		
		
	}

}
