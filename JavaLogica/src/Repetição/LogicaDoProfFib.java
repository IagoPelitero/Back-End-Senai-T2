package Repetição;

import java.util.Scanner;

public class LogicaDoProfFib {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int proximo=0,anterior=0,atual=1,limite=0;
		System.out.println("Quantos numeros fibonnacci deseja gerar?");
		limite=ler.nextInt();
		System.out.println(atual);
		for(int n=1;n<limite;n++)
				{
					proximo=atual+anterior;
					System.out.println(proximo);
					anterior=atual;
					atual=proximo;
				}

	}

}
