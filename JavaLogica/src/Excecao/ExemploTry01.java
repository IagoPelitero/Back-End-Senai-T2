package Excecao;

import java.util.Scanner;

public class ExemploTry01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, resp;
		System.out.println("Digite o primeiro número: ");
		n1=ler.nextInt();
		System.out.println("Digite o segundo número: ");
		n2=ler.nextInt();
		try {
			resp=n1/n2;
			System.out.println("A divisao é: "+resp);
		}catch(ArithmeticException erro) {
			System.out.println("Erro: Divisão por zero");
		}

	}

}
