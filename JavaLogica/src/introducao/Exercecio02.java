package introducao;

import java.util.Scanner;

public class Exercecio02 {

	public static void main(String[] args) {
		Scanner diasNasc = new Scanner(System.in);
		int anos, meses, dias;
		System.out.print("Digite quantos anos tem: ");
		anos=diasNasc.nextInt();
		System.out.print("Digite quantos meses tem: ");
		meses=diasNasc.nextInt();
		System.out.print("Digite quantos dias tem: ");
		dias=diasNasc.nextInt();
		int diasTotais= (anos * 365) + (meses * 30) + dias;
		System.out.print("Você possui: "+diasTotais);
		
	}

}
