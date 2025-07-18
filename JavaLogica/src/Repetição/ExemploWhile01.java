package Repetição;

import java.util.Scanner;

public class ExemploWhile01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, resp;
		System.out.println("Digite-1 para realizar a soma");
		resp=ler.nextInt();
		while(resp==-1) {
			System.out.println("Digite o primeiro numero");
			n1=ler.nextInt();
			System.out.println("Digite o segundo numero");
			n2=ler.nextInt();
			System.out.println("A soma dos numero e: "+(n1+n2));
			System.out.println("Digite-1 para repetir a soma");
			resp=ler.nextInt();
		}

	}

}
