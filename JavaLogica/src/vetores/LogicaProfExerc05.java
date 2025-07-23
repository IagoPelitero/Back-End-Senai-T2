package vetores;

import java.util.Scanner;

public class LogicaProfExerc05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int pa[] = new int[10];
		int pg[] = new int[10];
		int fi[] = new int[10];
		int init,raz,proximo=0,anterior=0, atual=1;		
		System.out.println("Digite o valor de inicio: ");
		init=ler.nextInt();
		System.out.println("Digite a razão: ");
		raz=ler.nextInt();
		pa[0]=init;
		pg[0]=init;
		for(int x=1; x<10; x++) {
			pa[x]=pa[x-1]+raz;
			pg[x]=pg[x-1]*raz;
		}
		fi[0]=atual;
		for(int n=1; n<10; n++) {
			proximo=atual+anterior;
			fi[n]=proximo;
			anterior=atual;
			atual=proximo;
		}
		
		System.out.println("Valores do vetor de PA: ");
		for(int n=0;n<10;n++)
			System.out.println(pa[n]+"\t");
		System.out.println("\nValores do vetor PG: ");
		for(int n=0;n<10;n++)
			System.out.println(pg[n]+"\t");

	}

}
