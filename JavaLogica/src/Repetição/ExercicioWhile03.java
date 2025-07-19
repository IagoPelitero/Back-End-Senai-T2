package Repetição;

import java.util.Scanner;

public class ExercicioWhile03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int proximo=0,anterior=0,atual=1,limite=0, resp=-1;
		
		while(resp==-1) {
			
			System.out.println("Digite um número para gerar uma sequência em Fibonacci");
			limite=ler.nextInt();
				while(proximo<limite) {
				System.out.println(atual);
				
				proximo=atual+anterior;
				System.out.println(proximo);
				anterior=atual;
				atual=proximo;
				}
				break;
			}
						
		    System.out.println("Digite 1 se deseja gerar outra sequência: ");
			limite=ler.nextInt();		
			
			}
		
	}
		
	
