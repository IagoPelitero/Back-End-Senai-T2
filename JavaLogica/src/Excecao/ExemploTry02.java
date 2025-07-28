package Excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTry02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, resp;
		try {
			System.out.println("Digite o primeiro número: ");
			n1=ler.nextInt();
			System.out.println("Digite o segundo número: ");
			n2=ler.nextInt();
			resp=n1/n2;
			System.out.println("A divisao é: "+resp);
		} catch(InputMismatchException erro) {
			System.out.println("Você deve digitar um número inteiro"+erro);
		} catch(ArithmeticException erro) {
			System.out.println("Erro: Divisão por zero"+erro);
		}
		System.out.println("F I M  D O  P R O G R A M A!!!");

	}

}
